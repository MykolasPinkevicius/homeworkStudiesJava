package threads;

public class Main {
	
	private static int i = 0;
	private static int j = 0;

	public static void main(String[]args) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread());
		
		A pirmasThread = new A();
		pirmasThread.start();
		
		System.out.println(Thread.currentThread());
		
		Thread antrasThread = new Thread(new B());
		antrasThread.start();
		
		for (int i = 0; i < 5; i++) {
			Thread a = new Thread(new B());
			a.start();
		}
		
		antrasThread.join();
		pirmasThread.join();
		
		System.out.println(Thread.currentThread());
	
//	private static void manoSynchronizuotas() {
//		synchronized(i) {
//		for (int k = 0 ; k < 10000000; k++) {
//			i++;
//		
//		}
//		synchronized(j) {
//		for (int p = 0; p < 10000000; p++) {
//			j++;
//		
//		}
//		
//	}

	
	class A extends Thread {
// extends darbas bus atliktas naujam Thread !!viena karta!!
		@Override
		public synchronized void start() {
			System.out.println("Cia vyksta is A thread");
		}
		
		
		
	}
	
	class B implements Runnable {
// kai mes turim runnable galima daryti daug kartu
		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			Math.random();
			System.out.println("Cia vyksta is B thread");
		}
		
	}
	
		}
		
}
