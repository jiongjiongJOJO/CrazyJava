public class BreakLabel
{
	public static void main(String[] args)
	{
		// ���ѭ����outer��Ϊ��ʶ��
		outer:
		for (var i = 0; i<5;i++)
		{
			for (var j=0 ;j<3;j++)
			{
				System.out.println("i��ֵΪ��"+i+" j��ֵΪ��"+j);
				if(j==1)
				{
					break outer;
				}
			}
			System.out.println("�ڲ�ѭ��������");
		}
		System.out.println("���ѭ��������");
	}
}