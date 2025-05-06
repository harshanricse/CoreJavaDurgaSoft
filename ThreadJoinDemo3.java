class ThreadJoinDemo3{
	public static void main(String []args) throws InterruptedException{
		Thread.currentThread().join();//Thread calling join() on same thread itself then program gets stuck(similar to deadlock)
	}
}