package Person;

/**
* Description:
* ��ʦ<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class Teacher extends Person
{
	/**
	* ��ʦ����޲ι�����
	*/
	public Teacher(){}
	/**
	* ��ʦ����вι�����
	* @param name String���ͣ���ʾ����
	* @param sex String���ͣ���ʾ�Ա�
	* @param age int���ͣ���ʾ����
	*/
	public Teacher(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	
	/**
	* ��ʦ��Ϊ��ʽ������
	*/
	public void work()
	{
		System.out.println("����һ����ʦ���ҵ�ְ���ǽ��飡");
	}
}