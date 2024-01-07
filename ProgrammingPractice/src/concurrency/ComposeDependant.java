package concurrency;

import java.util.concurrent.CompletableFuture;

public class ComposeDependant {

	public static void main(String[] args) {
		CompletableFuture<User> getUsersDetail(String userId) {
			return CompletableFuture.supplyAsync(() -> {
				return UserService.getUserDetails(userId);
			});	
		}

		CompletableFuture<Double> getCreditRating(User user) {
			return CompletableFuture.supplyAsync(() -> {
				return CreditRatingService.getCreditRating(user);
			});
		}
		
		CompletableFuture<Double> result = getUserDetail(userId)
				.thenCompose(user -> getCreditRating(user));

	}

}
