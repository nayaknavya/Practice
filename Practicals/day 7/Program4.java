class  webpage
{
	static String url;
	String UN;
	String pwd;
	static{
		url="www.gmail.com";
	}
	{
		UN="abc";
		pwd="abc123";
	}


void diaplay()
	{
		System.out.println("home page is displayed");
	}
}
class Program4
{
	public static void main(String[] args) 
	{
	
	webpage w1=new webpage();
System.out.println("URL:"+webpage.url);
System.out.println("user name:"+w1.UN);
System.out.println("Password:"+w1.pwd);
w1.diaplay();

     }
}
