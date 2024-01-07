package hackerrank.solutions.OOD.excercise.jukebox;

public class User {
	private String name;
	private long ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public User(String name, long iD) {
		
	}
	public User getUser() {
		return this;
	}
	public static User addUser(String name, long iD) {
		return null; // TBD
		
	}

}
