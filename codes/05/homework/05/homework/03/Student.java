package Person;

/**
* Description:
* 学生<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class Student extends Person
{
	/**
	* 学生类的无参构造器
	*/
	public Student(){}
	/**
	* 学生类的有参构造器
	* @param name String类型，表示姓名
	* @param sex String类型，表示性别
	* @param age int类型，表示年龄
	*/
	public Student(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	/**
	* 学生行为方式：学习
	*/
	public void work()
	{
		System.out.println("我是一名学生，我的职责是学习！");
	}
}