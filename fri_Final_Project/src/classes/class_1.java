package classes;



public class class_1 {
	//protected variables can only be accsess with in the class and classes derieve from that class
	protected String[][] genres;
	protected String action, comedy, horror, sci_fi;
	protected int year;

	//default constuctor
	public class_1()
	{
		action = "";
		comedy = "";
		horror = "";
		sci_fi = "";
		year = 0;
	
	}
}

class Alien extends class_1
{
	public Alien()
	{
		
	}
	public Alien( int year, String horror, String action)
	{
		
		this.horror = horror;
		this.action = action;
		this.year = year;

		
	}
}
class ET extends class_1
{
	public ET()
	{
		
	}
	public ET( int year, String action, String comedy, String sci_fi)
	{
		super();
		this.action = action;
		this.comedy = comedy;
		this.sci_fi = sci_fi;
		this.year = year;

		
	}

	
}