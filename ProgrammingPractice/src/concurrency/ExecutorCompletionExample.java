package concurrency;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCompletionExample {

	public static void main(String[] args) {
		final ExecutorService pool = Executors.newFixedThreadPool(5);
		final ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(pool);
		for (final String site : topSites) {
		    completionService.submit(new Callable<String>() {
		        @Override
		        public String call() throws Exception {
		            return IOUtils.toString(new URL("http://" + site), StandardCharsets.UTF_8);
		        }
		    });
		}
		
//		for (final String site : topSites) {
//		    completionService.submit(() -> {
//	            Thread.sleep(2000);
//	            return "Hello from Callable";
//	        });
//		}
		
		for(int i = 0; i < topSites.size(); ++i) {
		    final Future<String> future = completionService.take();
		    try {
		        final String content = future.get();
		        //...process contents
		    } catch (ExecutionException e) {
		        log.warn("Error while downloading", e.getCause());
		    }
		}

	}
	

}
