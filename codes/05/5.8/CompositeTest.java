class Animal
{
	private void beat()
	{
		System.out.println("心脏跳动……");
	}
	public void breathe()
	{
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中……");
	}
}

class Bird
{
	// 将原来的父类组合到原来的子类，作为子类的一个组合部分
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	// 重新定义自己的breathe()方法
	public void breathe()
	{
		// 直接复用Animal提供的breathe()方法来实现Bird的breathe()方法
		a.breathe();
	}
	public void fly()
	{
		System.out.println("我在天空自在的飞翔……");
	}
}
// 继承Animal，直接复用父类的breathe()方法
class Wolf
{
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	// 重新定义自己的breathe()方法
	public void breathe()
	{
		// 直接复用Animal提供的breathe()方法来实现Bird的breathe()方法
		a.breathe();
	}
	public void run()
	{
		System.out.println("我在陆地上快速的奔跑……");
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