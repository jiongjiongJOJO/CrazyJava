public class ThreeTest
{
	public static void main(String[] args)
	{
		String str = 5 > 3 ? "5����3" : "5������3";
		System.out.println(str); // ���"5����3"
		String str2 = null;
		if (5 > 3)
		{
			str2 = "5����3";
		}
		else
		{
			str2 = "5������3";
		}
		var a = 11;
		var b = 12;
		// ��Ŀ�����֧��Ƕ��
		System.out.println(a > b ?
			"a����b" : (a < b ? "aС��b" : "a����b"));
	}
}
