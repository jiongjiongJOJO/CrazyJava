public class Dog
{
	public void jump()
	{
		System.out.println("正在执行jump方法");
	}
	public void run()
	{
		// 创建实例调用jump，很显然不符合实际
		// var d = new Dog();
		// d.jump();
		
		// 通过this调用自身实例的jump
		// this.jump();
		
		
		//调用自身实例的时候，也可以省略this
		jump();
		System.out.println("正在执行run方法");
	}
}