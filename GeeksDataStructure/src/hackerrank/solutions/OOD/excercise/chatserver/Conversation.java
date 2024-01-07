package hackerrank.solutions.OOD.excercise.chatserver;

import java.util.ArrayList;

public abstract class Conversation {
	protected ArrayList<User> participants;
	protected int id;
	protected ArrayList<Message> messages;
	public ArrayList<Message> getMessages() {
		return messages; // TBD
		
	}
	public boolean addMessage(Message m) {
		return false; // TBD
		
	}
	public int getId() {
		return id; // TBD
		
	}

}
