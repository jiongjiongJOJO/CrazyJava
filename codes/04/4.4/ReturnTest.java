public class ReturnTest
{
	public static void main(String[] args)
	{
		for (var i=0;i<3;i++)
		{
			System.out.println("i��ֵ��" + i);
			if(i==1)
			{
				return;
			}
			System.out.println("return���������");
		}
	}
}