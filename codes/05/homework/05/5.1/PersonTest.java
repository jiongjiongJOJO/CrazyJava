public class PersonTest
{
	public static void main(String[] args)
	{
		Person p;
		p = new Person();
		// ��д��ʽ��
		// Person p = new Person();
		// var����
		// var p = new Person();
		p.name = "���";
		p.say("JAVA���Ժܼ򵥣�ѧϰ�����ף�");
		System.out.println(p.name);
		
		var p2 = p;
		System.out.println(p2.name);
	}
}