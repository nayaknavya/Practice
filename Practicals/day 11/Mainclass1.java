import java.util.Scanner;
class Employee 
{
	String empname;
	int empid;
	String companyname;
	int salary;

	Employee(String empname,int empid,String companyname,int salary)
	{
		this.empname=empname;
		this.empid=empid;
		this.companyname=companyname;
		this.salary=salary;
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner ei=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int size=ei.nextInt();
		Employee[] file=new Employee[size];

		System.out.println("Enter employee details");
		for(int i=0;i<file.length;i++)
		{
			System.out.println("Enter employee name");
			String var1=ei.next();
			System.out.println("Enter employee id");
			int var2=ei.nextInt();
			System.out.println("Enter company name");
			String var3=ei.next();
			System.out.println("Enter salary amount");
			int var4=ei.nextInt();
			file[i]=new Employee(var1,var2,var3,var4);
		}

		System.out.println("empname\tempid\tcompanyname\tsalary");
		System.out.println("-------------");
		for(int i=0;i<file.length;i++)
		{
			System.out.println(file[i].empname+"\t"+file[i].empid+"\t"+file[i].companyname+"\t"+file[i].salary);
		}
			
	}
}
