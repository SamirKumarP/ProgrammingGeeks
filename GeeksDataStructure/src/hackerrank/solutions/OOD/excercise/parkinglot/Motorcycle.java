package hackerrank.solutions.OOD.excercise.parkinglot;

public class Motorcycle extends Vehicle {
	
	public Motorcycle() {
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

}
