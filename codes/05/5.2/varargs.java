public class varargs
{
	public static void test(int a,String... books)
	{
		// books���������鴦��
		for(var tmp:books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		test(5,"���","JOJO","hello~");
	}
}