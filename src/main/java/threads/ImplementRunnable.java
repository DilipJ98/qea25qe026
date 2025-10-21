package threads;

public class ImplementRunnable   {
	public static void main(String[] args) {
		Runnable r = () -> 	System.out.println(Thread.currentThread().getName());
		Thread th = new Thread(r);
		th.start();
	}
}

