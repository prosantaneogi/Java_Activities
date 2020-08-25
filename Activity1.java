package javaActivity1;

public class Activity1 {

	public static void main(String[] args) {

		Car car = new Car();
    		car.make= 2014;
    		car.color = "black";
    		car.transmission = "Manual";
    	
    	System.out.println(car);
    	car.displayCharacteristics();
    	car.accelarate();
    	car.brake();
    	
	}

}
