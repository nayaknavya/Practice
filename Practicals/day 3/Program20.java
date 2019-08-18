class Program20 
{
	static double findarea(char choice)
	{
		double area=0.0;
		switch(choice)
		{
			case 't': double b=10;
			double h=5;
			area=(1.0/2.0)*b*h;
			// System.out.println("area is " +area);
			break;

			case 'c': double pi=3.14;
			double r=3;
			area=pi*r*r;
			break;

			case 'R': double l=12;
			double bre=3;
			area=l*bre;
			break;
		}
		return area;
	}

	public static void main(String[] args) 
	{
		double x=findarea('t');
		double y=findarea('c');
		double z=findarea('R');
System.out.println("Triangle area is"+x);
System.out.println("circle area is"+y);
System.out.println("rectangle area is"+z);
	}
}
