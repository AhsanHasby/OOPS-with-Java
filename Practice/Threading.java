package Practice;

class A extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Thread running");
		for(int i = 0; i < 50; i++)
			System.out.println(Thread.currentThread().getName() + " Thread running");
	}
}

class B implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Thread running");
		for(int i = 0; i < 50; i++){
			System.out.println(i + "." + Thread.currentThread().getName() + " Thread running");
			try{
				Thread.sleep(300);
			} catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName() + " interrupted");
			}
		}
	}
}


class Threading{
	public static void main(String args[]) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " Thread running");
		
		A t1 = new A();
		t1.start();
		t1.join();

		Thread t2 = new Thread(new B());
		System.out.println("t2 is daemon? = " + t2.isDaemon());
		t2.setDaemon(true);
		t2.start();
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread running");
			Thread.sleep(150);
		}
		
	}
}