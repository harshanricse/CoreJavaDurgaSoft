class MyThread extends Thread{
	static Thread pt;
	public void run(){
		try{
			pt.join();//waiting for main thread to complete
		}
		catch(InterruptedException e){
		}
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
class ThreadJoinDemo2{
	public static void main(String []args){
		MyThread.pt = Thread.currentThread();
		Thread t = new MyThread();
		t.start();//starting child thread
		try{
			t.join();//waiting for child thread to complete
		}
		catch(InterruptedException e){
		}
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}	
}