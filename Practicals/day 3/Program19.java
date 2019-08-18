class Program19
{
	static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
	}


	public static void main(String[] args) 
	{
		swap(5,3);
	}
}