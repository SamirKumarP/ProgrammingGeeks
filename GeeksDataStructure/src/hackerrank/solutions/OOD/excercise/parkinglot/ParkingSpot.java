package hackerrank.solutions.OOD.excercise.parkinglot;

public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {
		
	}
	public boolean isAvilable() {
		return vehicle == null;
	}
	/*
	 * Check if spot is big enough and available
	 */
	public boolean canFitVehicle(Vehicle vehicle) {
		return false; // TBD
		
	}
	/*
	 * Park vehicle in this spot.
	 */
	public boolean park(Vehicle v) {
		return false; // TBD
		
	}
	public int getRow() {
		return row;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	/*
	 * Remove vehicle from spot, and notify level that a new spot is available
	 */
	public void removeVehicle() {
		
	}
	

}
