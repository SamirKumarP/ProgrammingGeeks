package hackerrank.solutions.OOD.excercise.onlinebookreader;

public class User {
	private int userId;
	private String details;
	private int accountType;
	private void renewMembership() {
		
	}
	public User(int id, String details, int accountType) {
		userId = id;
		this.details = details;
		this.accountType = accountType;
	}
	/*
	 * Getters and setters
	 */
	public int getID() {
		return userId;
	}
	public void setID(int id) {
		userId = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int t) {
		accountType = t;
	}
	

}
