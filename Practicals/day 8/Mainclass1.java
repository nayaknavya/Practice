class  song
{
    String songtype;
	String language;
	String singername;

	String gettype()
	{
		return songtype;
	}
	String getlang()
	{
		return language;
	}
	String getname()
	{
		return singername;
	}

	void settype(String arg1)
	{
		songtype=arg1;
	}
	void setlang(String arg1)
	{
		language=arg1;
	}
	void setname(String arg1)
	{
		singername=arg1;
	}
}

class Mainclass1
{
	public static void main(String[] args) 
	{
	
	song s1=new song();
    s1.settype("Remix");
	s1.setlang("Hindi");
	s1.setname("Sonu Nigam");
	System.out.println(s1.gettype()+"\t"+s1.getlang()+"\t"+s1.getname());

     }
}
