package com;

import java.util.concurrent.locks.*;

//import com.sun.deploy.util.SyncAccess.Lock;

public class Lock_Condition_Ex {

	static int magazine[] = new int[10];
	static int bullet = 0;
	static Lock lock = new ReentrantLock();
	static Condition notFull = lock.newCondition();
	static Condition notEmpty = lock.newCondition();

	public static boolean isFull(int[] arr) {
		int count = 1;
		for (int a : arr) {
			count++;
		}
		return count == 10 ? true : false;
	}

	public static boolean isEmpty(int[] arr) {
	
		return arr[0] == 1 ? false : true;
		
	}

	public static class Reloader {

		public void reload() throws InterruptedException {

			try {

				lock.tryLock();
				while (isFull(magazine))
					notFull.await();
				magazine[bullet++] = 1;
				System.out.println("Bullet reloaded..");
				notEmpty.signal();
			} finally {
				lock.unlock();
			}

		}
	}

	static class Gunman {

		public void fire() throws InterruptedException {

			try {

				lock.tryLock();
				while (isEmpty(magazine))
					notEmpty.await();
				magazine[--bullet] = 0;
				System.out.println("firing a shot..boom!");
				notFull.signal();
			} finally {
				lock.unlock();
			}

		}
	}

	public static void main(String[] args) {

		Reloader reloader1 = new Reloader();
		Reloader reloader2 = new Reloader();
		Gunman gunman1 = new Gunman();
		
		 
		
		
	}
}
