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

class Bird
{
	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϲ���
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	// ���¶����Լ���breathe()����
	public void breathe()
	{
		// ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Bird��breathe()����
		a.breathe();
	}
	public void fly()
	{
		System.out.println("����������ڵķ��衭��");
	}
}
// �̳�Animal��ֱ�Ӹ��ø����breathe()����
class Wolf
{
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	// ���¶����Լ���breathe()����
	public void breathe()
	{
		// ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Bird��breathe()����
		a.breathe();
	}
	public void run()
	{
		System.out.println("����½���Ͽ��ٵı��ܡ���");
	}
}

public class CompositeTest
{
	public static void main(String[] args)
	{
		var a1 = new Animal();
		var b = new Bird(a1);
		b.breathe();
		b.fly();
		
		var a2 = new Animal();
		var w = new Wolf(a2);
		w.breathe();
		w.run();
	}
}