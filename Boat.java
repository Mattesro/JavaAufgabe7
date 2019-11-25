class Boat extends Vehicle
{
	public Boat(String brand, int kilometers)
	{
		super(brand, kilometers);

	}
	public String doStuff()
	{
	return " I am the boat " + this.getbrand() + " and I go glug glug!";
   	}
}	
// end class Boat
