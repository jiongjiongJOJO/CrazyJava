class Animal
{
	private void beat()
	{
		System.out.println("������������");
	}
	public void breathe()
	{
		beat();
		System.out.println("��һ��������һ�����������С���");
	}
}
// �̳�Animal��ֱ�Ӹ��ø����breathe()����
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("����������ڵķ��衭��");
	}
}
// �̳�Animal��ֱ�Ӹ��ø����breathe()����
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���Ͽ��ٵı��ܡ���");
	}
}

public class InheritTest
{
	public static void main(String[] args)
	{
		var b = new Bird();
		b.breathe();
		b.fly();
		
		var w = new Wolf();
		w.breathe();
		w.run();
	}
}