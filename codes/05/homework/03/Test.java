package Test;

import Person.Student;
import Person.Teacher;
import Person.HeadTeacher;
import School.School;

/**
* Description:
* ������<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class Test
{
	/**
	* ������ĺ������
	* @param args ������ڲ���
	*/
	public static void main(String[] args)
	{
		Student s1 = new Student("����","��",18);
		System.out.println("----------------------ѧ����Ϣ----------------------");
		System.out.println("������" + s1.getName() + "\t���䣺" + s1.getAge() + "\t�Ա�" + s1.getSex());
		s1.work();s1.eat();s1.drink();s1.sleep();s1.walk();s1.run();
		System.out.println("----------------------ѧ����Ϣ----------------------");
		System.out.println("");
		
		Teacher t1 = new Teacher("����","��",38);
		System.out.println("----------------------��ʦ��Ϣ----------------------");
		System.out.println("������" + t1.getName() + "\t���䣺" + t1.getAge() + "\t�Ա�" + t1.getSex());
		t1.work();t1.eat();t1.drink();t1.sleep();t1.walk();t1.run();
		System.out.println("----------------------��ʦ��Ϣ----------------------");
		System.out.println("");
		
		HeadTeacher ht1 = new HeadTeacher("����","Ů",40);
		System.out.println("---------------------��������Ϣ---------------------");
		System.out.println("������" + ht1.getName() + "\t���䣺" + ht1.getAge() + "\t�Ա�" + ht1.getSex());
		ht1.work();s1.eat();ht1.drink();ht1.sleep();ht1.walk();ht1.run();
		System.out.println("---------------------��������Ϣ---------------------");
		System.out.println("");
		
		School sch = new School("���տƼ�ѧԺ","����ʡ�����л�ɽ���1501��");
		System.out.println("----------------------ѧУ��Ϣ----------------------");
		System.out.println("У����" + sch.getName() + "\t��ַ��" + sch.getAddress());
		System.out.println("----------------------ѧУ��Ϣ----------------------");
		System.out.println("");
	}
}