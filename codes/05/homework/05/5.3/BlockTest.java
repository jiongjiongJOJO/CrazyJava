public class BlockTest
{
	public static void main(String[] args)
	{
		{
			// 定义一个代码块局部变量a
			int a;
			// 下面代码将出现错误，因为a变量还没初始化
			// System.out.println("代码块局部变量a的值：" + a);
			// 为a变量赋初始值，也就是进行初始化
			a = 5;
			System.out.println("代码块局部变量a的值：" + a);
		}
		// 下面试图访问的a变量并不存在
		// System.out.println(a);
	}
}