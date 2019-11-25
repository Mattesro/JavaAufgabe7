public class Hangar
{
	private static final int ANZ_Vehicle; // Größe Arraydefinition
 	private static Vehicle [] vVehicle;
	static
	{
     		ANZ_Vehicle = 4;
     		vVehicle = new Vehicle[ANZ_Vehicle];
	}
 
	public static void main (String[] args)
	{
     		vVehicle[0] = new Car("Mercedes-CL220", 230);
     		vVehicle[3] = new Car("Ford-Ka", 160);
		vVehicle[2] = new Boat("Queen Mary", 60);
     		vVehicle[1] = new Boat("Deutschland", 50);
 
		for (Vehicle element : vVehicle)
		{
			System.out.println(element.doStuff());
		}
 	}
} 	
// end class Hangar

/*  Ergebnis:

 I am the car Mercedes-CL220 and I go zoom zoom zoom!
 I am the boat Deutschland and I go glug glug!
 I am the boat Queen Mary and I go glug glug!
 I am the car Ford-Ka and I go zoom zoom zoom!

*/


