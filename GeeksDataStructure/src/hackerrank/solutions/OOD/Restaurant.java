package hackerrank.solutions.OOD;

// Singleton
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static Restaurant _instance = null;
	protected Restaurant() {
		
	}
	public static Restaurant getInstance() {
		if (_instance == null) {
			_instance = new Restaurant();
		}
		return _instance;
	}

}
