package Test;

import Person.Student;
import Person.Teacher;
import Person.HeadTeacher;
import School.School;

/**
* Description:
* 测试类<br />
* Date：2021年11月29日<br />
* @author 囧囧JOJO 41473909@qq.com
* @version 1.0
*/
public class Test
{
	/**
	* 测试类的函数入口
	* @param args 函数入口参数
	*/
	public static void main(String[] args)
	{
		Student s1 = new Student("张三","男",18);
		System.out.println("----------------------学生信息----------------------");
		System.out.println("姓名：" + s1.getName() + "\t年龄：" + s1.getAge() + "\t性别：" + s1.getSex());
		s1.work();s1.eat();s1.drink();s1.sleep();s1.walk();s1.run();
		System.out.println("----------------------学生信息----------------------");
		System.out.println("");
		
		Teacher t1 = new Teacher("李四","男",38);
		System.out.println("----------------------教师信息----------------------");
		System.out.println("姓名：" + t1.getName() + "\t年龄：" + t1.getAge() + "\t性别：" + t1.getSex());
		t1.work();t1.eat();t1.drink();t1.sleep();t1.walk();t1.run();
		System.out.println("----------------------教师信息----------------------");
		System.out.println("");
		
		HeadTeacher ht1 = new HeadTeacher("王二","女",40);
		System.out.println("---------------------班主任信息---------------------");
		System.out.println("姓名：" + ht1.getName() + "\t年龄：" + ht1.getAge() + "\t性别：" + ht1.getSex());
		ht1.work();s1.eat();ht1.drink();ht1.sleep();ht1.walk();ht1.run();
		System.out.println("---------------------班主任信息---------------------");
		System.out.println("");
		
		School sch = new School("安徽科技学院","安徽省蚌埠市黄山大道1501号");
		System.out.println("----------------------学校信息----------------------");
		System.out.println("校名：" + sch.getName() + "\t地址：" + sch.getAddress());
		System.out.println("----------------------学校信息----------------------");
		System.out.println("");
	}
}