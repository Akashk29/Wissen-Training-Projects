package com;

import java.util.concurrent.TimeUnit;

class NumberGenerator {

	static int i = 1, j = 2, count = 10;

	public synchronized static void oddGen() {

		count--;
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		if(count >=0) {
		System.out.println(i);
		i+=2;
		NumberGenerator.evenGen();
		}
		else Thread.currentThread().stop();
	}

	public synchronized static void evenGen() {

		count--;
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		if(count>=0) {
			
		System.out.println(j);
		j += 2;
		NumberGenerator.oddGen();
		
		}
		else Thread.currentThread().stop();
	}

}

public class Synchronized_Ex {

	public static void main(String[] args) {

		Runnable taskOdd = new Runnable() {

			@Override
			public void run() {
				
				NumberGenerator.oddGen();
				
			}
		};

		Runnable taskEven = new Runnable() {

			@Override
			public void run() {
				
				NumberGenerator.evenGen();
				
			}
		};

		
		Thread t1 = new Thread(taskOdd, "OddThread");
		Thread t2 = new Thread(taskEven, "Eventhread");
		
		t1.start();
		t2.start();
		
	}

}
