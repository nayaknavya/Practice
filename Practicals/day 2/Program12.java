class Program12 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{
				if((r==0||c==0)||(r==n-1||c==n-1)||(r==c||r+c==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
                   System.out.println( );
			}
	}
}
