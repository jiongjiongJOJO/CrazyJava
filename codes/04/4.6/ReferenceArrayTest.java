class Person
{
	public int age;//����
	public double height;//���
	// ����һ��info����
	public void info()
	{
		System.out.println("�ҵ������ǣ�" + age + "���ҵ�����ǣ�" + height);
	}
}

public class ReferenceArrayTest
{
	public static void main(String[] args)
	{
		// ����һ��student�����������������Person[]
		Person[] student;
		// ִ�ж�̬��ʼ��
		student = new Person[2];
		// ����һ��Personʵ�����������Personʾ������zhang����
		var zhang = new Person();
		// Ϊzhang�����õ�Person�����age��height��ֵ
		zhang.age = 15;
		zhang.height = 158;
		// ����һ��Personʵ�����������Personʵ������lee����
		var lee = new Person();
		// Ϊlee�����õ�Person�����age��height��ֵ
		lee.age = 16;
		lee.height = 161;
		// ��zhang������ֵ��ֵ����һ������Ԫ��
		student[0] = zhang;
		// ��lee������ֵ��ֵ���ڶ�������Ԫ��
		student[1] = lee;
		// �������д���Ľ����ȫһ������Ϊlee �� student[1]ָ�����ͬһ��Personʵ��
		lee.info();
		student[1].info();
	}
}