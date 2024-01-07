package hackerrank.solutions.OOD.excercise.parkinglot;

public class Bus extends Vehicle {
	
	public Bus() {
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}

	/*
	 * Checks if the spot is a Large. Doesn't change num of spots
	 */
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false; // TBD
	}

}
