import java.util.Scanner;
class Student 
{
	String name;
	int id;
	double marks;

	Student(String name,int id,double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner si=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=si.nextInt();
		Student[] record=new Student[size];

		System.out.println("Enter Studnet details");
		for(int i=0;i<record.length;i++)
		{
			System.out.println("Enter Student name");
			String var1=si.next();
			System.out.println("Enter student id");
			int var2=si.nextInt();
			System.out.println("Enter Student marks");
			double var3=si.nextDouble();
			record[i]=new Student(var1,var2,var3);
		}

		System.out.println("name\tid\tmarks");
		System.out.println("-------------");
		for(int i=0;i<record.length;i++)
		{
			System.out.println(record[i].name+"\t"+record[i].id+"\t"+record[i].marks);
		}
			
	}
}
