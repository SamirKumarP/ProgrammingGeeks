package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureBasics {

//	completableFuture.complete("Future's Result")

	public static void main(String[] args) {
		Executor executor = Executors.newFixedThreadPool(10);
		// Using Lambda Expression
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			// Simulate a long-running Job
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			System.out.println("I'll run in a separate thread than the main thread.");
		}, executor);
	}

	// Using Lambda Expression
	CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
		return "Result of the asynchronous computation";
	});

}
