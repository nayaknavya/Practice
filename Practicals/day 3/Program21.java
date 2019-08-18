class Program21 
{
	static double findarea(String choice)
	{
		double area=0.0;
		switch(choice)
		{
			case "triangle": double b=10;
			double h=5;
			area=(1.0/2.0)*b*h;
			// System.out.println("area is " +area);
			break;

			case "circle": double pi=3.14;
			double r=3;
			area=pi*r*r;
			break;

			case "rectangle": double l=12;
			double bre=3;
			area=l*bre;
			break;
		}
		return area;
	}

	public static void main(String[] args) 
	{
		double x=findarea("triangle");
		double y=findarea("circle");
		double z=findarea("rectangle");
System.out.println("Triangle area is"+x);
System.out.println("circle area is"+y);
System.out.println("rectangle area is"+z);
	}
}
