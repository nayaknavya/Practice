import java.util.Scanner;
class bike 
{
	String name;
	static int wheels=2;
	int engine;
	 void run()
	{
		if(engine>200)
		{
			System.out.print("max speed:200km/hr");
		}
		else
		{
			System.out.print("max speed:100km/hr");
		}
	}

}
class Program1
{
	public static void main(String[] args) 
	{
		bike b1= new bike();
		bike b2=new bike();
		Scanner si=new Scanner(System.in);
		System.out.println("Enter Bike details: ");
		System.out.println("Enter Bike 1 name: ");
		b1.name=si.nextLine();
		System.out.println("Enter Bike capacity: ");
		b1.engine=si.nextInt();

		System.out.println("Enter Bike 2 name: ");
		b2.name=si.next();
		System.out.println("Enter Bike capacity: ");
		b2.engine=si.nextInt();

		System.out.println("Bike 1 details: ");
		System.out.println("name:"+b1.name \t b2.name);
		System.out.println("Wheels: "+bike.wheels+\t+bike.wheels);
        System.out.println("capacity: "+b1.engine+"CC"+\t++b2.engine+"CC");
		/*b1.run();

		System.out.println("Bike 2 details: ");
		System.out.println("name: "+b2.name);
		System.out.println("Wheels: "+bike.wheels);
        System.out.println("capacity: "+b2.engine+"CC");		
				b2.run();
*/
	}
}
