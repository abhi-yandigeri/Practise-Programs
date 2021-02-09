package Day8;

public class Car {
	int yearmodel;
	String make;
	int speed;
	public Car(int yearmodel, String make)
	{
		this.yearmodel=yearmodel;
		this.make=make;
		speed=0;
		
	}
	public int getYearmodel() {
		return yearmodel;
	}
	public void setYearmodel(int yearmodel) {
		this.yearmodel = yearmodel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accelerate()
	{
		speed+=5;//increase speed by 5
	}
	public void brake()
	{
		speed-=5;
	}
}







