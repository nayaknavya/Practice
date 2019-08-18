import java.util.Scanner;
class Product 
{
	String name;
	int id;
	String cost;

	Product(String name,int id,String cost)
	{
		this.name=name;
		this.id=id;
		this.cost=cost;
	}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner pi=new Scanner(System.in);
		System.out.println("Enter the number of Products");
		int size=pi.nextInt();
		Product[] file=new Product[size];

		System.out.println("Enter Product details");
		for(int i=0;i<file.length;i++)
		{
			System.out.println("Enter Product name");
			String var1=pi.next();
			System.out.println("Enter Product id");
			int var2=pi.nextInt();
			System.out.println("Enter Product cost");
			String var3=pi.next();
			file[i]=new Product(var1,var2,var3);
		}

		System.out.println("name\tid\tcost");
		System.out.println("-------------");
		for(int i=0;i<file.length;i++)
		{
			System.out.println(file[i].name+"\t"+file[i].id+"\t"+file[i].cost);
		}
			
	}
}
