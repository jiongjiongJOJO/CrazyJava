import java.util.Arrays;
import java.util.function.*;

public class ArraysTest2
{
	public static void main(String[] args)
	{
		var arr1 = new int[] {3,-4,25,16,30,18};
		// ������arr1���в�������
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
		var arr2 = new int[] {3,-4,25,16,30,18};
		Arrays.parallelPrefix(arr2,new IntBinaryOperator()
		{
			// left������������ǰһ����������Ԫ�أ�right����ԭ�����е�ǰ��������Ԫ�أ�������ĵ�һ��Ԫ���ܵ���ԭ����ĵ�һ��Ԫ��
			public int applyAsInt(int left,int right)
			{
				return left*right;
			}
		});
		System.out.println(Arrays.toString(arr2));
		var arr3 = new int[5];
		Arrays.parallelSetAll(arr3,new IntUnaryOperator()
		{
			// operand �������ڼ����Ԫ������
			public int applyAsInt(int operand)
			{
				return operand * 5;
			}
		});
		System.out.println(Arrays.toString(arr3));
	}
}