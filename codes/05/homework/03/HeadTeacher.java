package Person;

/**
* Description:
* ������<br />
* Date��2021��11��29��<br />
* @author ���JOJO 41473909@qq.com
* @version 1.0
*/
public class HeadTeacher extends Teacher
{
	/**
	* ����������޲ι�����
	*/
	public HeadTeacher(){}
	/**
	* ����������вι�����
	* @param name String���ͣ���ʾ����
	* @param sex String���ͣ���ʾ�Ա�
	* @param age int���ͣ���ʾ����
	*/
	public HeadTeacher(String name,String sex,int age)
	{
		super(name,sex,age);
	}
	/**
	* �����ε���Ϊ������͹���༶
	*/
	@Override
	public void work()
	{
		System.out.println("����һ�������Σ��ҵ�ְ�𲻽��ǽ��飬��Ҫ����༶��");
	}
}