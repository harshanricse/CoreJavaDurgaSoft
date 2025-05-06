class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10000;i++){
			System.out.println("I am lazy thread"+i);
		}
		System.out.println("I want to sleep");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}

	}
class ThreadInterruptDemo1
{
	public static void main(String []args){
		Thread t = new MyThread();
		t.start();
		t.interrupt();//whenever t thread comes into sleeping state, main thread interrupts t thread
	}
}