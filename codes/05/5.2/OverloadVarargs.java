public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("ֻ��һ���ַ���������test����");
	}
	public void test(String... books)
	{
		System.out.println("*********�β������ɱ��test����**********");
	}
	public static void main(String[] args)
	{
		var olv = new OverloadVarargs();
		olv.test("aa","bb");
		olv.test("hello");
		olv.test(new String[] {"aa"});
	}
}