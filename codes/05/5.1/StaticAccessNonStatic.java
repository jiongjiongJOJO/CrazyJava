public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args)
	{
		// ��Ϊmain()�����Ǿ�̬��������info()�ǷǾ�̬��������˵���main()�������Ǹ���ı��������Ǹ����ʵ��
		// ���ʡ��this�޷�ָ����Ч�Ķ���
		// info();
		
		// ����һ��������Ϊ������������info()����
		new StaticAccessNonStatic().info();
	}
}