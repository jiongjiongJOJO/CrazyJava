package School;

/**
* Description:
* ѧУ<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class School
{
	private String name;
	private String address;
	
	/**
	* ѧУ����޲ι�����
	*/
	public School(){}
	/**
	* ѧУ����вι�����
	* @param name String���ͣ���ʾУ��
	* @param address String���ͣ���ʾѧУ��ַ
	*/
	public School(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	/**
	* ����У��
	* @param name String���ͣ���ʾУ��
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* ����ѧУ��ַ
	* @param address String���ͣ���ʾѧУ��ַ
	*/
	public void setAddress(String address)
	{
		this.address = address;
	}
	/**
	* ��ȡѧУ��ַ
	* @return String���ͣ�ѧУ��ַ
	*/
	public String getAddress()
	{
		return this.address;
	}
	/**
	* ��ȡУ��
	* @return String���ͣ�У��
	*/
	public String getName()
	{
		return this.name;
	}
}