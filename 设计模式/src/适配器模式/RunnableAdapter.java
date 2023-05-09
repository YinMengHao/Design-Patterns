package 适配器模式;

import java.util.concurrent.Callable;

public class RunnableAdapter implements Runnable {
	
	// 引用待转换接口：
	private Callable<?> callable;
	
	public RunnableAdapter(Callable<?> callable) {
		this.callable = callable;
		
	}

	// 实现指定接口
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("111111");
		// 将指定接口调用委托给转换接口调用
		try {
			callable.call();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		
	}

}
