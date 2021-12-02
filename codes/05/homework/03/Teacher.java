package Person;

/**
* Description:
* 教师<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class Teacher extends Person
{
	/**
	* 教师类的无参构造器
	*/
	public Teacher(){}
	/**
	* 教师类的有参构造器
	* @param name String类型，表示姓名
	* @param sex String类型，表示性别
	* @param age int类型，表示年龄
	*/
	public Teacher(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	
	/**
	* 教师行为方式：教书
	*/
	public void work()
	{
		System.out.println("我是一名教师，我的职责是教书！");
	}
}