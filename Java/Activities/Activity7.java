package activities;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(5, 0, 30);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(8);
	}

}
