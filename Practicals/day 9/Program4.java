class Laptop 
{
	String name;
	 String os;
	 static int ram;

	Laptop()
	{
		//name="HP";
		os="Windows10";
		//ram=4;
	}
	static
	{
		System.out.println("static1 started");
		ram=2;
		System.out.println("static1 ended");
	}
	static
	{
		System.out.println("static2 started");
		System.out.println("static2 ended");
	}

	{
		System.out.println("non static1 started");
		name="abc";
		System.out.println("non static1 ended");
	}

	{
		System.out.println("non static2 started");
		os="Windows8";
		System.out.println("non static2 ended");
	}


	void details()
	{
		System.out.println("name :"+name);
		System.out.println("os:"+os);
		System.out.println("ram:"+ram);
	}

	
}
class Program4
{
	public static void main(String[] args) 
	{
		System.out.println("mainmethod started");
		Laptop L1=new Laptop();
		L1.details();
		System.out.println("mainmethod ended");
		
	}
}
