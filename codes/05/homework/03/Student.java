package Person;

/**
* Description:
* ѧ��<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class Student extends Person
{
	/**
	* ѧ������޲ι�����
	*/
	public Student(){}
	/**
	* ѧ������вι�����
	* @param name String���ͣ���ʾ����
	* @param sex String���ͣ���ʾ�Ա�
	* @param age int���ͣ���ʾ����
	*/
	public Student(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	/**
	* ѧ����Ϊ��ʽ��ѧϰ
	*/
	public void work()
	{
		System.out.println("����һ��ѧ�����ҵ�ְ����ѧϰ��");
	}
}