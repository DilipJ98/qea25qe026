package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadsExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.currentTimeMillis();
		A a = new A();
		B b = new B();
//		a.methodA();
//		b.methodB();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		Future<Integer> futureOne = threadPool.submit(a);
		Future<String> futureTwo = threadPool.submit(b);
		
		
		threadPool.shutdown();
		
		threadPool.awaitTermination(30, TimeUnit.SECONDS);
		System.out.println(futureOne.get());
		System.out.println(futureTwo.get());
		
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		System.out.println(Thread.currentThread().getName());
	}
}

class A implements Callable<Integer> {
	
	public Integer call() {
		return methodA();
	}
	
	public Integer methodA() {
		try {
			Thread.sleep(5000);
			System.out.println("this is method A: " + Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}
		return 100;
	}
}


class B implements Callable<String> {
	
	public String call() {
		return methodB();
	}
	
	public String methodB() {
		try {
			Thread.sleep(7000);
			System.out.println("this is method B: " + Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}
		return "Dileep";
	}

}