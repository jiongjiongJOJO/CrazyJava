package School;

/**
* Description:
* 学校<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class School
{
	private String name;
	private String address;
	
	/**
	* 学校类的无参构造器
	*/
	public School(){}
	/**
	* 学校类的有参构造器
	* @param name String类型，表示校名
	* @param address String类型，表示学校地址
	*/
	public School(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	/**
	* 设置校名
	* @param name String类型，表示校名
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* 设置学校地址
	* @param address String类型，表示学校地址
	*/
	public void setAddress(String address)
	{
		this.address = address;
	}
	/**
	* 获取学校地址
	* @return String类型，学校地址
	*/
	public String getAddress()
	{
		return this.address;
	}
	/**
	* 获取校名
	* @return String类型，校名
	*/
	public String getName()
	{
		return this.name;
	}
}