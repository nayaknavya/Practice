class  song
{
	static String songtype;
	String language;
	String singername;
	static{
		songtype="filmy";
	}
	{
		language="Hindi";
		singername="Sonu Nigam";
	}
	
	{
		System.out.println("song is playing");
	}

	static
	{
		System.out.println("song is playing1");
	}

}
class Program3
{
	public static void main(String[] args) 
	{
	
	song s1=new song();
System.out.println("Songtype:"+song.songtype);
System.out.println("Songlanguage:"+s1.language);
System.out.println("Singer name:"+s1.singername);
//s1.play();
     }
}
