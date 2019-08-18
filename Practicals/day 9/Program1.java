class Student 
{
	
	Student()
	{
		System.out.println("Constructor started");
		System.out.println("Constructor ended");
	}
	static
	{
		System.out.println("static1 started");
		System.out.println("static1 ended");
	}
	static
	{
		System.out.println("static2 started");
		System.out.println("static2 ended");
	}

	{
		System.out.println("non static1 started");
		System.out.println("non static1 ended");
	}

	{
		System.out.println("non static2 started");
		System.out.println("non static2 ended");
	}
	
}
class Program1
{
	public static void main(String[] args)
	{
		System.out.println("mainmethod started");
		Student s1=new Student();
		System.out.println("mainmethod ended");
	}
}

