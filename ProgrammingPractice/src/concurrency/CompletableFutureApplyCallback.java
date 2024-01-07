package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureApplyCallback {

	public static void main(String[] args) {
		Executor executor = Executors.newFixedThreadPool(2);
		CompletableFuture.supplyAsync(() -> {
		    return "Some result"
		}).thenApplyAsync(result -> {
		    // Executed in a thread obtained from the executor
		    return "Processed Result"
		}, executor);
		
		
//		ThenApply
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Rajeev";
		}).thenApplyAsync(name -> {
		    return "Hello " + name;
		}).thenApplyAsync(greeting -> {
		    return greeting + ", Welcome to the CalliCoder Blog";
		});

		System.out.println(welcomeText.get());
		// Prints - Hello Rajeev, Welcome to the CalliCoder Blog
		
		
		// thenAccept() example
		CompletableFuture.supplyAsync(() -> {
			return ProductService.getProductDetail(productId);
		}).thenAccept(product -> {
			System.out.println("Got product detail from remote service " + product.getName())
		});
		
		// thenRun() example
		CompletableFuture.supplyAsync(() -> {
		    // Run some computation  
		}).thenRun(() -> {
		    // Computation Finished.
		});
	}

}
