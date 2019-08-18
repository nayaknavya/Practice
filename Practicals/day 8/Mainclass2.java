class  webpage
{
	String url;
	String un;
	String pwd;
	
	String geturl()
	{
		return url;
	}
	String getun()
	{
		return un;
	}
	String getpwd()
	{
		return pwd;
	}

	void seturl(String arg1)
	{
		url=arg1;
	}
	void setun(String arg1)
	{
		 un=arg1;
	}
	void setpwd(String arg1)
	{
		pwd=arg1;
	}
}

class Mainclass2
{
	public static void main(String[] args) 
	{
	
	webpage w1=new webpage();
w1.seturl("www.gmail.com");
w1.setun("abcd123");
w1.setpwd("123456");
System.out.println(w1.geturl()+"\t"+w1.getun()+"\t"+w1.getpwd());

     }
}
