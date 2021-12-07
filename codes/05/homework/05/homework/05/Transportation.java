public class Transportation
{
	private String name;
	private int speed;
	
	Transportation(String name,int speed)
	{
		this.name = name;
		this.speed = speed;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
}