public class Overload
{
	public void test()
	{
		System.out.println("�޲���");
	}
	public void test(String msg)
	{
		System.out.println("���ص�test���� " + msg);
	}
	public static void main(String[] args)
	{
		var ol = new Overload();
		ol.test();
		ol.test("hello");
	}
}