public class PrimitiveArrayTest
{
	public static void main(String[] args)
	{
		// ����һ��int[]���͵��������
		int[] iArr;
		// ��̬��ʼ�����飬���鳤��Ϊ5
		iArr = new int[5];
		// ����ѭ����ʽΪÿ������Ԫ�ظ�ֵ
		for (var i=0;i<iArr.length;i++)
		{
			iArr[i] = i+10;
		}
	}
}