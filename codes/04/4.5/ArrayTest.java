public class ArrayTest
{
	public static void main(String[] args)
	{
		/*
		��̬��ʼ��
		*/
		// ����һ��int�������͵ı�����������ΪintArr
		int[] intArr;
		// ʹ�þ�̬��ʼ������ʼ������ʱ��ָ������Ԫ�صĳ�ʼֵ����ָ�����鳤��
		intArr = new int[] {5,6,8,20};
		// ����һ��Object���͵ı�����������ΪobjArr;
		Object[] objArr;
		// ʹ�þ�̬��ʼ������ʼ������ʱ�����Ԫ�������Ƕ�������ʱ��ָ����Ԫ�����͵�����
		objArr = new String[] {"Java","���JOJO"};
		Object[] objArr2;
		// ʹ�þ�̬��ʼ��
		objArr2 = new Object[] {"Java","���JOJO"};
		
		int[] a = {5,6,7,9};
		
		
		/*
		��̬��ʼ��
		*/
		// ����Ķ���ͳ�ʼ��ͬʱ��ɣ�ʹ�ö�̬��ʼ���﷨
		int[] prices = new int[5];
		// ����Ķ���ͳ�ʼ��ͬʱ��ɣ���ʼ������ʱԪ�ص������Ƕ�������ʱԪ�����͵�����
		Object[] books = new String[4];
		
		
		/*
		--------------------------------------
		*/
		var names = new String[] {"yeeku","nono"};
		var weightArr = new double[4];
		
		
		/*
		ʹ������
		*/
		// ���objArr����ĵڶ���Ԫ�أ�������ַ��������JOJO��
		System.out.println(objArr[1]);
		// ΪobjArr2�ĵ�һ������Ԫ�ظ�ֵ
		objArr2[0] = "Spring";
		// ��������Ԫ��ָ��������ֵ�������鳤�ȣ�����������뽫������ʱ�����쳣
		// System.out.println(objArr2[2]);
		for (var i=0;i<prices.length;i++)
		{
			System.out.println(prices[i]);
		}
		books[0] = "���Java����";
		books[1] = "������Java EE��ҵӦ��ʵս";
		// ʹ��ѭ�����books�����ÿ������Ԫ�ص�ֵ
		for (var i=0;i<books.length;i++)
		{
			System.out.println(books[i]);
		}
		
	}
}