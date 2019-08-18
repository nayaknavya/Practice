class Program18 
{
	static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
	}


	public static void main(String[] args) 
	{
		swap(5,3);
	}
}
