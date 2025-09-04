package activities;

public class Car {
	
	
	String color;
	String transmission;
	 int make;
	 int tyres;
	int doors;
	
	Car(){
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("color : "+color+","+" transmission: "+transmission+","+" make: "+make+","+" tyres: "+ tyres+","+ " doors: "+doors);
		
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
