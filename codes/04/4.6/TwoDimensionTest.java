public class TwoDimensionTest
{
	public static void main(String[] args)
	{
		// ����һ����ά����
		int[][] a;
		// ��a����һά������г�ʼ������ʼ��a��һ������Ϊ4�����飬a���������Ԫ��������������
		a = new int[4][];
		// ��a���鵱����Ϊ���飬����a�����ÿ������Ԫ��
		for (int i=0,len=a.length;i<len;i++)
		{
			System.out.println(a[i]);
		}
		// ��ʼ��a������ĵ�һ��Ԫ��
		a[0] = new int[2];
		// ����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		// a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
		for(int i=0,len = a[0].length;i<len;i++)
		{
			System.out.println(a[0][i]);
		}
		String[][] str1 = new String[][] {new String[3],new String[]{"hello"}};
		String[][] str2 = {new String[3],new String[]{"hello"}};
		/*
		for(String[] i : str1)
		{
			for (String j : i)
			{
				System.out.println(j);
			}
		}
		System.out.println("----------------------------");
		for(String[] i : str2)
		{
			for (String j : i)
			{
				System.out.println(j);
			}
		}
		*/
	}
}