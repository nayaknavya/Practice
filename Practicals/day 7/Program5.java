class smartcard 
{
	static String cardname;
	String cardtype;
	static{
		cardname="abdfg";
	}
	{
		cardtype="VISA";
	}
	void netbanking()
	{
		System.out.println("Card type used is VISA");
	}
}
	class Program5
	{
	
	public static void main(String[] args) 
	{
		smartcard s1=new smartcard();

		System.out.println("Cardname:"+smartcard.cardname);
		System.out.println("Cardtype:"+s1.cardtype);
		s1.netbanking();
	}
}
