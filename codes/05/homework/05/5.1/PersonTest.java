public class PersonTest
{
	public static void main(String[] args)
	{
		Person p;
		p = new Person();
		// 简写形式：
		// Person p = new Person();
		// var定义
		// var p = new Person();
		p.name = "囧囧";
		p.say("JAVA语言很简单，学习很容易！");
		System.out.println(p.name);
		
		var p2 = p;
		System.out.println(p2.name);
	}
}