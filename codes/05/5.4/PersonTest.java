public class PersonTest
{
	public static void main(String[] args)
	{
		var p = new Person();
		// p.age = 1000;
		p.setAge(1000);
		System.out.println("未能设置age成员变量时：" + p.getAge());
		
		p.setAge(30);
		System.out.println("成功设置age成员变量时：" + p.getAge());
		
		p.setName("囧囧JOJO");
		System.out.println("成功设置name成员变量时：" + p.getName());
	}
}