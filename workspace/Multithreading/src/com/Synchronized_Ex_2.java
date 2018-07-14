package com;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Synchronized_Ex_2 {

	static private Object tableLock = new Object();
	static List<Integer> buffer = new ArrayList<>(10);

	public static boolean isFull(List<Integer> buffer) {
		
		int count = 0;
		for(Integer a:buffer) {
			count++;
		}
		return count==10 ? true : false;
	}
	
	static class VegChef {

		void produce() {

			synchronized (tableLock) {

				if (isFull(buffer)) {

					try {
						tableLock.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

				buffer.add(0); // 0 represents a veg item
				System.out.println("Vegchef has produced..");
				tableLock.notifyAll();
			}

		}

	}
	
	static class NonVegChef {

		// public Vegchef()

		void produce() {

			synchronized (tableLock) {

				if (isFull(buffer)) {

					try {
						tableLock.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

				buffer.add(1); // 1 represents a non veg item 
				System.out.println("NonVegchef has produced..");
				tableLock.notifyAll();
			}

		}

	}
	
	static class Consumer {

		// public Vegchef()

		void consume() {

			synchronized (tableLock) {

				if (buffer.isEmpty()) {

					try {
						tableLock.wait() ;
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

				int rem = buffer.remove(0);
				System.out.println("Consumer has eaten " + rem + ".." );
				tableLock.notifyAll();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		
		VegChef chef1 = new VegChef();
		NonVegChef chef2 = new NonVegChef();
		Consumer consumer1 = new Consumer();
		
		Runnable vegTask = () -> {
			
			for(int i = 0; i<10 ; i++) {
				
				chef1.produce();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			} 
			
			System.out.println("Done producing veg..");
		};
		
	Runnable nonVegTask = () -> {
			
			for(int i = 0; i<10 ; i++) {
				
				chef2.produce();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Done producing non veg..");
		};
		
Runnable consumeTask = () -> {
			
			for(int i = 0; i<10 ; i++) {
				
				consumer1.consume();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
			System.out.println("Done eating");
		};
		
		
		Thread vegThread = new Thread(vegTask);
		Thread nonvegThread = new Thread(nonVegTask);
		Thread consumeThread = new Thread(consumeTask);
		
		vegThread.start();
		nonvegThread.start();
		consumeThread.start();
		
		vegThread.join();
		nonvegThread.join();
		consumeThread.join();

	}

}
