public class PersonTest
{
	public static void main(String[] args)
	{
		var p = new Person();
		// p.age = 1000;
		p.setAge(1000);
		System.out.println("δ������age��Ա����ʱ��" + p.getAge());
		
		p.setAge(30);
		System.out.println("�ɹ�����age��Ա����ʱ��" + p.getAge());
		
		p.setName("���JOJO");
		System.out.println("�ɹ�����name��Ա����ʱ��" + p.getName());
	}
}