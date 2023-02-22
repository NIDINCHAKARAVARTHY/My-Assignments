package week1.day1;

public class Car {

	public void driveCar() {
	System.out.println("DRIVE THE CAR");
      }
	public void applyBrake() {
		System.out.println("APLLY THE BRAKE");
	  }
	public void soundHorn() {
		System.out.println("SOUND HORN");
	  }
	public void isPuncture() {
		System.out.println("TYRE IS PUNCTURE");
	  }
	public static void main(String[] args) {
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		
	  }
}
