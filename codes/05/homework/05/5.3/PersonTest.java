class Person
{
	// ����һ��ʵ������
	public String name;
	// ����һ�������
	public static int eyeNum;
}
public class PersonTest
{
	public static void main(String[] args)
	{
		// ��һ������ʹ��person�࣬�����Զ���ʼ������eyeNum������ʼ�����ã����0
		System.out.println("Person��eyeNum�����ֵ��" + Person.eyeNum);
		// ����Person����
		var p = new Person();
		// ͨ��Person���������p������Person����nameʵ����������ͨ��ʵ������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name + " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ֱ��Ϊnameʵ��������ֵ
		p.name = "�����";
		// ͨ��p����eyeNum���������Ȼ�Ƿ���Person��eyeNum�����
		p.eyeNum = 2;
		// �ٴ�ͨ��p�޸���Person��eyeNumʵ��������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name + " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ǰ��ͨ��p�޸���Person��eyeNum���˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum�����ֵ��" + Person.eyeNum);
		var p2 = new Person();
		// p2���ʵ�eyeNum�������Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum����ֵ�ǣ�" + p2.eyeNum);
	}
}