public class Dog
{
	public void jump()
	{
		System.out.println("����ִ��jump����");
	}
	public void run()
	{
		// ����ʵ������jump������Ȼ������ʵ��
		// var d = new Dog();
		// d.jump();
		
		// ͨ��this��������ʵ����jump
		// this.jump();
		
		
		//��������ʵ����ʱ��Ҳ����ʡ��this
		jump();
		System.out.println("����ִ��run����");
	}
}