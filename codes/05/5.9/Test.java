class Root
{
	static{
		System.out.println("Root�����ʼ����");
	}
	{
		System.out.println("Root��ʵ����ʼ����");
	}
	public Root()
	{
		System.out.println("Root���޲����Ĺ�����");
	}
}

class Mid extends Root
{
	static{
		System.out.println("Mid�����ʼ����");
	}
	{
		System.out.println("Mid��ʵ����ʼ����");
	}
	public Mid()
	{
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg)
	{
		this();
		System.out.println("Mid�Ĵ������Ĺ������������ֵΪ��" + msg);
	}
}

class Leaf extends Mid
{
	static{
		System.out.println("Leaf�����ʼ����");
	}
	{
		System.out.println("Leaf��ʵ����ʼ����");
	}
	public Leaf()
	{
		super("���Java����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}

public class Test
{
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}