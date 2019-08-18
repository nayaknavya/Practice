import java.util.Scanner;
class Course 
{
	String name;
	int fees;
	double duration;

	Course(String name,int fees,double duration)
	{
		this.name=name;
		this.fees=fees;
		this.duration=duration;
	}
}
class Mainclass5
{
	public static void main(String[] args) 
	{

		System.out.println("Main method started");
		Scanner ci=new Scanner(System.in);
		System.out.println("Enter the number of courses");
		int size=ci.nextInt();
		Course[] details=new Course[size];

		System.out.println("Enter course details");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter course name");
			String var1=ci.next();
			System.out.println("Enter course fees");
			int var2=ci.nextInt();
			System.out.println("Enter course duration");
			double var3=ci.nextDouble();
			details[i]=new Course(var1,var2,var3);
		}

		System.out.println("name\tfees\tduration");
		System.out.println("---------");
		for(int i=0;i<size;i++)
		{
			System.out.println(details[i].name+"\t"+details[i].fees+"\t"+details[i].duration);
		}
		System.out.println("main method ended");
	}
}
