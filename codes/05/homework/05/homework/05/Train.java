public class Train extends Transportation
{
	private String time;
	
	Train(String name,String time,int speed)
	{
		super(name,speed);
		this.time = time;
	}
	
	public String getTime()
	{
		return this.time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
}