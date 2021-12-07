package Person;

/**
* Description:
* ��<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class Person
{
	private String name;
	private String sex;
	private int age;
	
	/**
	* �˵��޲ι�����
	*/
	public Person(){}
	/**
	* �˵��вι�����
	* @param name String���ͣ���ʾ����
	* @param sex String���ͣ���ʾ�Ա�
	* @param age int���ͣ���ʾ����
	*/
	public Person(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	/**
	* �����˵�����
	* @param name String���ͣ���ʾ����
	*/
	public void steName(String name)
	{
		this.name = name;
	}
	/**
	* �����˵��Ա�
	* @param sex String���ͣ���ʾ�Ա�
	*/
	public void steSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* �����˵�����
	* @param age int���ͣ���ʾ����
	*/
	public void steAge(int age)
	{
		this.age = age;
	}
	/**
	* ��ȡ�˵�����
	* @return String���ͣ�����
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* ��ȡ�˵��Ա�
	* @return String���ͣ��Ա�
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* ��ȡ�˵�����
	* @return int���ͣ�����
	*/
	public int getAge()
	{
		return this.age;
	}
	
	/**
	* �˵���Ϊ���Զ���
	*/
	public void eat()
	{
		System.out.println(this.name + " ���ڳԶ�������");
	}
	/**
	* �˵���Ϊ��������
	*/
	public void drink()
	{
		System.out.println(this.name + " ���ں�ˮ����");
	}
	/**
	* �˵���Ϊ��˯��
	*/
	public void sleep()
	{
		System.out.println(this.name + " ����˯������");
	}
	/**
	* �˵���Ϊ����·
	*/
	public void walk()
	{
		System.out.println(this.name + " ������·����");
	}
	/**
	* �˵���Ϊ���ܲ�
	*/
	public void run()
	{
		System.out.println(this.name + " �����ܲ�����");
	}
}