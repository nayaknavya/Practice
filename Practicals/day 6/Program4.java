import java.util.Scanner;
class bike 
{
	String name;
	static int wheels=2;
	int engine;
	int sd;

	 int run()
	{
		if(engine>200)
		{
			sd=200;
					}
		else
		{
			sd=100;
		}
		return sd;
		
	}
}
class Program4
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

		System.out.println("***************Bike details:***************** ");
		System.out.println("Name\t\t wheels\t\t engine\t\t run()\t\t");

		System.out.println(b1.name+"\t\t"+b1.wheels+"\t\t"+b1.engine+"\t\t"+b1.run());
        System.out.println(b2.name+"\t\t"+b2.wheels+"\t\t"+b2.engine+"\t\t"+b2.run());
		
	}
}
