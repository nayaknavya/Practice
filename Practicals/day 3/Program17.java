class Program17 
{
	static void findmax(int a,int b,int c)
	{
		int max=a;
		if(max<b)
		{
			max=b;
		}
		if(max<c)
			max=c;
		System.out.println("max number is "+max);
	}
	public static void main(String[] args) 
	{
		findmax(1,2,3);
	}
}
