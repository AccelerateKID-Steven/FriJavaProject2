package classes;



public class Movies {
	//protected variables can only be accsess with in the class and classes derieve from that class
	protected String[][] genres;
	protected String action, comedy, horror, sci_fi, company;
	protected int year, rating;

	//default constuctor
	public Movies()
	{
		action = "";
		comedy = "";
		horror = "";
		sci_fi = "";
		year = 0;
	
	}
}

class Animated extends Movies
{
	public Animated()
	{
		
	}
	public Animated( int year, int rating, String company)
	{
		
		this.company = company;
		this.year = year;
		this.rating = rating;
		String animation_company;
		boolean Stop_motion;
		String[] voice_actors;
	}
}
class fantasy extends Movies
{
	public fantasy()
	{
		
	}
	public fantasy( int year, int rating, String company)
	{
		super();
		this.year = year;
		this.rating = rating;
		this.company = company;
		String CGI_company;
		
	}

	
}
class live_action extends Movies
{
	public live_action()
	{
		
	}
	public live_action( int year, int rating, String company)
	{
		super();
		this.year = year;
		this.rating = rating;
		this.company = company;
		String[] actors;
		
	}

	
}
class documenterie extends Movies
{
	public documenterie()
	{
		
	}
	public documenterie( int year, int rating, String company)
	{
		super();
		this.year = year;
		this.rating = rating;
		this.company = company;
		String researchCompany;
		
	}

	
}
class international extends Movies
{
	public international()
	{
		
	}
	public international( int year, int rating, String company)
	{
		super();
		this.year = year;
		this.rating = rating;
		this.company = company;
		String nation;
		
	}

	
}









