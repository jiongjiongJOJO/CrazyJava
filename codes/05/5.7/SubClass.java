class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("�������ͨ����");
	}
	public void test()
	{
		System.out.println("����ı����ǵķ���");
	}
}
public class SubClass extends BaseClass
{
	public String book = "������Java EE��ҵӦ��ʵս";
	public void test()
	{
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);
		ploymophicBc.base();
		ploymophicBc.test();
		// ploymophicBc.sub(); //��Ϊ�������У�������û�У����Իᱨ��
		
		// �������ƶϳ�v1��SubClass����
		var v1 = new SubClass();
		// ����ploymophicBc�ı���ʱ������BaseClass����˱������ƶϳ�v2��BaseClass����
		var v2 = ploymophicBc;
		// ����ploymophicBc��û���ṩsub��������������������ʱ����ִ���
		// v2.sub();
	}
}
