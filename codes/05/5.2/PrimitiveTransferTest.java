public class PrimitiveTransferTest
{
	public static void swap(int a,int b)
	{
		var tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap�����a��ֵ��" + a + "��b��ֵ��" + b);		
	}
	public static void main(String[] args)
	{
		var a = 6;
		var b = 9;
		swap(a,b);
		System.out.println("���������󣬱���a��ֵ��" + a + "������b��ֵ��" + b);
	}
}