package hackerrank.solutions.OOD.excercise.chatserver;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
	
	private int id;
	private UserStatus status = null;
	/*
	 * maps from the other particpant's used id to the chat
	 */
	private HashMap<Integer, PrivateChat> privateChats;
	/*
	 * list of group chats
	 */
	private ArrayList<GroupChat> groupChats;
	/*
	 * maps from the other person's user id to the add request
	 */
	private HashMap<Integer, AddRequest> receivedAddRequests;
	/*
	 * maps from other person's user id to the add request
	 */
	private HashMap<Integer, AddRequest> sentAddRequests;
	/*
	 * maps from the user id to the user object
	 */
	private HashMap<Integer, User> contacts;
	private String accountName;
	private String fullName;
	public User(int id, String accountName, String fullName) {
		
	}
	public boolean sendMessageToUser(User to, String content) {
		return false; // TBD
		
	}
	public boolean sendMessageToGroupChat(int id, String cnt) {
		return false; // TBD
		
	}
	public void setStatus(UserStatus status) {
		
	}
	public UserStatus getStatus() {
		return status; // TBD
		
	}
	public boolean addContact(User user) {
		return false; // TBD
		
	}
	public void receivedAddRequest(AddRequest req) {
		
	}
	public void sentAddRequest(AddRequest req) {
		
	}
	public void removeAddRequest(AddRequest req) {
		
	}
	public void requestAddUser(String accountName) {
		
	}
	public void addConversation(PrivateChat conversation) {
		
	}
	public void addConversation(GroupChat conversation) {
		
	}
	public int getId() {
		return id; // TBD
		
	}
	public String getAccountName() {
		return accountName; // TBD
		
	}
	public String getFullName() {
		return accountName; // TBD
		
	}
	

}
