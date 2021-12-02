public class varargs
{
	public static void test(int a,String... books)
	{
		// books被当成数组处理
		for(var tmp:books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		test(5,"囧囧","JOJO","hello~");
	}
}