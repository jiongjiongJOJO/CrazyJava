package Person;

/**
* Description:
* 人<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class Person
{
	private String name;
	private String sex;
	private int age;
	
	/**
	* 人的无参构造器
	*/
	public Person(){}
	/**
	* 人的有参构造器
	* @param name String类型，表示姓名
	* @param sex String类型，表示性别
	* @param age int类型，表示年龄
	*/
	public Person(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	/**
	* 设置人的姓名
	* @param name String类型，表示姓名
	*/
	public void steName(String name)
	{
		this.name = name;
	}
	/**
	* 设置人的性别
	* @param sex String类型，表示性别
	*/
	public void steSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* 设置人的年龄
	* @param age int类型，表示年龄
	*/
	public void steAge(int age)
	{
		this.age = age;
	}
	/**
	* 获取人的姓名
	* @return String类型，姓名
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* 获取人的性别
	* @return String类型，性别
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* 获取人的年龄
	* @return int类型，年龄
	*/
	public int getAge()
	{
		return this.age;
	}
	
	/**
	* 人的行为：吃东西
	*/
	public void eat()
	{
		System.out.println(this.name + " 正在吃东西……");
	}
	/**
	* 人的行为：喝饮料
	*/
	public void drink()
	{
		System.out.println(this.name + " 正在喝水……");
	}
	/**
	* 人的行为：睡觉
	*/
	public void sleep()
	{
		System.out.println(this.name + " 正在睡觉……");
	}
	/**
	* 人的行为：走路
	*/
	public void walk()
	{
		System.out.println(this.name + " 正在走路……");
	}
	/**
	* 人的行为：跑步
	*/
	public void run()
	{
		System.out.println(this.name + " 正在跑步……");
	}
}