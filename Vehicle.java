abstract class Vehicle
{
	private String vehicleBrand;
	private int vehicleKilometers;

	// constructor
	public Vehicle (String brand, int kilometers)
	{
		this.vehicleBrand = brand;
		this.vehicleKilometers = kilometers;
	}
	// getters
	public String getbrand() 
	{
		return this.vehicleBrand;
	}
	public int getkilometers() 
	{
		return this.vehicleKilometers;
	}

	// setters
	public void setbrand(String brand) 
	{
		this.vehicleBrand = brand;
	}
	public void setkilometers(int kilometers) 
	{
		this.vehicleKilometers = kilometers;
	}

	public abstract String doStuff();

} 	
// end class Vehicle
