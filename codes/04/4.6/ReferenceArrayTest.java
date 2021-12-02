class Person
{
	public int age;//年龄
	public double height;//身高
	// 定义一个info方法
	public void info()
	{
		System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
	}
}

public class ReferenceArrayTest
{
	public static void main(String[] args)
	{
		// 定义一个student数组变量，起类型是Person[]
		Person[] student;
		// 执行动态初始化
		student = new Person[2];
		// 创建一个Person实例，并将这个Person示例赋给zhang变量
		var zhang = new Person();
		// 为zhang所引用的Person对象的age、height赋值
		zhang.age = 15;
		zhang.height = 158;
		// 创建一个Person实例，并将这个Person实例赋给lee变量
		var lee = new Person();
		// 为lee所引用的Person对象的age、height赋值
		lee.age = 16;
		lee.height = 161;
		// 将zhang变量的值赋值给第一个数组元素
		student[0] = zhang;
		// 将lee变量的值赋值给第二个数组元素
		student[1] = lee;
		// 下面两行代码的结果完全一样，因为lee 和 student[1]指向的是同一个Person实例
		lee.info();
		student[1].info();
	}
}