class Program16 
{
	static int factorial(int b)
	{
		
		int fact=1;
		while(b>0)
		{
			fact=fact*b;
			--b;
		}
		
		return fact;
		
	}
	public static void main(String[] args) 
	{
		int res=factorial(5);
		System.out.println("factorial is"+res);
	}
}
