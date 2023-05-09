package 适配器模式;

import java.util.concurrent.Callable;

public class Task implements Callable<Long> {
	private long num;
	public Task(long num) {
		this.num = num;
	}
	
	public Long call() throws Exception {
		long r = 0;
		for (int i = 1; i <= this.num; i++) {
			r = r + i;
		}
		System.out.println("Result: " + r);
		return r;
	}
}
