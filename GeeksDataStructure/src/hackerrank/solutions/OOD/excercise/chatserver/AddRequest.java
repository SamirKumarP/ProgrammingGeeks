package hackerrank.solutions.OOD.excercise.chatserver;

import java.util.Date;

public class AddRequest {
	private User fromUser;
	private User toUser;
	private Date date;
	RequestStatus status;
	public AddRequest(User from, User to, Date date) {
		
	}
	public RequestStatus getStatus() {
		return status; // TBD
		
	}
	public User getFromUser() {
		return fromUser; // TBD
		
	}
	public User getToUser() {
		return toUser; // TBD
		
	}
	public Date getDate() {
		return date; // TBD
		
	}

}
