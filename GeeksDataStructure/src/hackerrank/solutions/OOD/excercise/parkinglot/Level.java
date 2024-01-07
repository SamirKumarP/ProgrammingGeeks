package hackerrank.solutions.OOD.excercise.parkinglot;

/*
 * Represents a level in a parking garage
 */
public class Level {

	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots = 0; // number of free spots
	private static final int SPORTS_PER_POW = 10;
	public Level(int flr, int numberSpots) {
		
	}
	public int availableSpots() {
		return availableSpots;
	}
	/*
	 * Find a place to park this vehicle. Return false if failed.
	 */
	public boolean parkVehicle(Vehicle vehicle) {
		return false; // TBD
		
	}
	/*
	 * Park a vehicle starting at the spotNumber, and continuing until
	 * vehicle.spotsNeeded.
	 */
	private boolean parkStartingAtSpot(int num, Vehicle v) {
		return false; // TBD
		
	}
	/*
	 * Find a spot to park this vehicle. Return index of spot, or 1 on failure.
	 */
	private int findAvailableSpots(Vehicle vehicle) {
		return availableSpots; // TBD
		
	}
	/*
	 * When a car was removed from the spot, increment availableSpots
	 */
	public void spotFreed() {
		availableSpots++;
	}
}
