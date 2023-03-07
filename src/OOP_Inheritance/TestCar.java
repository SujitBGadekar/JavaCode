package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual

		System.out.println("-----");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		System.out.println("-----");
		// child class object can be referred by parent class ref variable
		// Top/Up Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

		// down casting:
		// parent class object can be referred by child class ref variable
		BMW b1 = (BMW) new Car();// ClassCastException at runtime

	}

}
