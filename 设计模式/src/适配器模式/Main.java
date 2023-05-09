package 适配器模式;

import java.util.concurrent.Callable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Callable<Long> callable = new Task(1234500000L);
		Thread thread = new Thread(new RunnableAdapter(callable));
		System.out.println("2222");
		thread.start();
		System.out.println("3333");
		
	}

}
