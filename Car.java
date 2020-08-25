package javaActivity1;

public class Car {

	//add the variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//Make a constructor to initialize tyres to 4 and doors to 4
	
	Car(){
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics(){
		System.out.println("Color of the Car: "+ color);
		System.out.println("Make of the car :" + make);
		System.out.println("Transmissio of the car : "+transmission);
		System.out.println("Number of doors on the car :"+doors);
		System.out.println("Number of tyres : " + tyres);
	}
	
	public void accelarate(){
	System.out.println("Car is moving forward.");
	}
	public void brake(){
		System.out.println("Car has stopped.");
	}
	
}
