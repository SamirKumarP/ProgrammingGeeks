package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableAllOf {

	public static void main(String[] args) {
		List<String> webPageLinks = Arrays.asList(...);	// A list of 100 web page links
				// Download contents of all the web pages asynchronously
				List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
				        .map(webPageLink -> downloadWebPage(webPageLink))
				        .collect(Collectors.toList());
				// Create a combined Future using allOf()
				CompletableFuture<Void> allFutures = CompletableFuture.allOf(
				        pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()])
				);
				// When all the Futures are completed, call 'future.join()' to get their results and collect the results in a list -
				CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
				   return pageContentFutures.stream()
				           .map(pageContentFuture -> pageContentFuture.join())
				           .collect(Collectors.toList());
				});
				
				
				// Count the number of web pages having the "CompletableFuture" keyword.
				CompletableFuture<Long> countFuture = allPageContentsFuture.thenApply(pageContents -> {
				    return pageContents.stream()
				            .filter(pageContent -> pageContent.contains("CompletableFuture"))
				            .count();
				});

				System.out.println("Number of Web Pages having CompletableFuture keyword - " + 
				        countFuture.get());

	}

	CompletableFuture<String> downloadWebPage(String pageLink) {
		return CompletableFuture.supplyAsync(() -> {
			// Code to download and return the web page's content
		});
	}
}
