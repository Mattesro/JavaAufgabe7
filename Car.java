class Car extends Vehicle
{
	public Car(String brand, int kilometers)
	{
		super(brand, kilometers);

	}
	public String doStuff()
	{
	return " I am the car " + this.getbrand() + " and I go zoom zoom zoom!";
   	}
}	
// end class Car
