package concurrency;

import java.util.concurrent.Callable;

public class Multiply implements Callable<Integer> {
	private int start;
	private int end;

	public Multiply(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return start * end;
	}
}
