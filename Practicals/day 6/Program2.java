import java.util.Scanner;
class laptop 
{
	String name;
	static int ram=8;
	String os;

}
class Program2
{
	public static void main(String[] args) 
	{
		laptop l1= new laptop();
		laptop l2= new laptop();
		Scanner si=new Scanner(System.in);
		System.out.println("Enter laptop details: ");
		System.out.println("Enter laptop 1 name: ");
		l1.name=si.nextLine();
		System.out.println("Enter laptop os: ");
		l1.os=si.next();

		System.out.println("Enter laptop 2 name: ");
		l2.name=si.next();
		System.out.println("Enter laptop os: ");
		l2.os=si.next();


		System.out.println("Laptop 1 details: ");
		System.out.println("name: "+l1.name);
		System.out.println("ram: "+laptop.ram+"gb");
        System.out.println("OS: "+l1.os);

		System.out.println("Laptop 2 details: ");
		System.out.println("name: "+l2.name);
		System.out.println("ram: "+laptop.ram+"gb");
        System.out.println("OS: "+l2.os);

	}
}
