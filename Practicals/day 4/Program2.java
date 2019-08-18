import java.util.Scanner;
class Program2  
{
	public static void main(String[] args) 
	{
		char a='w';
		if(a=='d')
		{
			bank.deposit();
		}
		else if(a=='w')
		{
			bank.withdraw();
		}
		bank.balance();
		
	}
}
class bank
{
	static double b=5000;
	static void deposit()
	{
		double d=200;
		b=b+d;
	}
	static void withdraw()
	{
		double w=200;
		if(w<=b)
		{
			b=b-w;
			System.out.println("withdraw successful");
		}
		else
		{
			System.out.println("withdraw not successful");
		}
	}
	static void balance()
	{
		System.out.println("balance is"+b);
	}
}
