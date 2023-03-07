package OOP_Inheritance;

public class BMW extends Car {

	// Method Overriding:
	// when we have a method in parent class and the same method in child class:
	// with the same method name
	// with the same number of parameters
	// with the same seq of parameters
	// with the same return type

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	
	

}

