public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("只有一个字符串参数的test方法");
	}
	public void test(String... books)
	{
		System.out.println("*********形参数量可变的test方法**********");
	}
	public static void main(String[] args)
	{
		var olv = new OverloadVarargs();
		olv.test("aa","bb");
		olv.test("hello");
		olv.test(new String[] {"aa"});
	}
}