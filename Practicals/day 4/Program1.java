class Program1 
{
	public static void main(String[] args) 
	{
		int n=39;
		if(n==((n/10)+(n%10)+(n/10)*(n%10)))
		{
		    System.out.println("Special number");
		}
		else
		{
			System.out.println("not a Special number");
		}

	}
}
