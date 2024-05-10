package Coding;

public class car {

	private String colour;
	private int height ;
	
	//Constructor is called when new keyword is used 
	
	/*public car(String c,int h) {
		
		this.colour = c;
		this.height = h;
	}
	
	public car()
	{
		this.colour = "Grey";
		this.height = 50;
	}
	*/
	public boolean start()
	{
		System.out.println("Started");
		return true;
	}
	
	public boolean stop()
	{
		System.out.println("Stopped");
		return true;
	}
	
	public String getColour()
	{
		return this.colour;
	}
	
	
	public void setColour(String c)
	{
		this.colour = c;
	}
	
}
