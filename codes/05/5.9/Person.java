public class Person
{
	// ���涨��һ��ʵ����ʼ����
	{
		var a = 6;
		if(a>4)
		{
			System.out.println("Personʵ����ʼ���飺�ֲ��б���a��ֵ����4");
		}
		System.out.println("Person��ʵ����ʼ����");
	}
	// ����ڶ���ʵ����ʼ����
	{
		System.out.println("Person�ĵڶ���ʵ����ʼ����");
	}
	// �����޲����Ĺ�����
	public Person()
	{
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}