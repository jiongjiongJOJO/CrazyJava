public class ArrayInRam
{
	public static void main(String[] args)
	{
		// ���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a = {5,7,20};
		// ���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		var b = new int[4];
		// ���b����ĳ���
		System.out.println("b�����鳤��Ϊ��" + b.length);
		// ѭ�����a�����Ԫ��
		for(int i=0,len=a.length;i<len;i++)
		{
			System.out.println(a[i]);
		}
		// ѭ�����b�����Ԫ��
		for(int i=0,len = b.length;i<len;i++)
		{
			System.out.println(b[i]);
		}
		// ��Ϊa��int[]���ͣ�bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b
		// Ҳ������b����ָ��a����ָ�������
		b = a;
		System.out.println("b����ĳ���Ϊ��" + b.length);
	}
}