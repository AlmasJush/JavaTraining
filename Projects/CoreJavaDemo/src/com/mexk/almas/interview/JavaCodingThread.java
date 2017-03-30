package com.mexk.almas.interview;

public class JavaCodingThread extends Thread {

	private int counter;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<100000; i++)
				counter++;
			
			this.notifyAll();
			System.out.println("Completed counting....");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		JavaCodingThread jct = new JavaCodingThread();
		jct.start();
		Thread.sleep(10000);
		System.out.println("Wating to get End...");

		synchronized(jct){
		jct.wait();
		}

		System.out.println(jct.counter);
	}
}
