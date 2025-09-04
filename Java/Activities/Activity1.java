package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.color="Black";
		c.transmission="Manual";
		c.make=2014;
		
		c.displayCharacteristics();
		c.accelarate();
		c.brake();

	}

}
