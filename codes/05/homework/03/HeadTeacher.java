package Person;

/**
* Description:
* 班主任<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class HeadTeacher extends Teacher
{
	/**
	* 班主任类的无参构造器
	*/
	public HeadTeacher(){}
	/**
	* 班主任类的有参构造器
	* @param name String类型，表示姓名
	* @param sex String类型，表示性别
	* @param age int类型，表示年龄
	*/
	public HeadTeacher(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	/**
	* 班主任的行为：教书和管理班级
	*/
	@Override
	public void work()
	{
		System.out.println("我是一名班主任，我的职责不仅是教书，还要管理班级！");
	}
}