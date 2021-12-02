public class ArrayTest
{
	public static void main(String[] args)
	{
		/*
		静态初始化
		*/
		// 定义一个int数组类型的变量，变量名为intArr
		int[] intArr;
		// 使用静态初始化，初始化数组时至指定数组元素的初始值，不指定数组长度
		intArr = new int[] {5,6,8,20};
		// 定义一个Object类型的变量，变量名为objArr;
		Object[] objArr;
		// 使用静态初始化，初始化数组时数组的元素类型是定义数组时所指定的元素类型的子类
		objArr = new String[] {"Java","囧囧JOJO"};
		Object[] objArr2;
		// 使用静态初始化
		objArr2 = new Object[] {"Java","囧囧JOJO"};
		
		int[] a = {5,6,7,9};
		
		
		/*
		动态初始化
		*/
		// 数组的定义和初始胡同时完成，使用动态初始化语法
		int[] prices = new int[5];
		// 数组的定义和初始化同时完成，初始化数组时元素的类型是定义数组时元素类型的子类
		Object[] books = new String[4];
		
		
		/*
		--------------------------------------
		*/
		var names = new String[] {"yeeku","nono"};
		var weightArr = new double[4];
		
		
		/*
		使用数组
		*/
		// 输出objArr数组的第二个元素，将输出字符串“囧囧JOJO”
		System.out.println(objArr[1]);
		// 为objArr2的第一个数组元素赋值
		objArr2[0] = "Spring";
		// 访问数组元素指定的索引值等于数组长度，所以下面代码将在运行时出现异常
		// System.out.println(objArr2[2]);
		for (var i=0;i<prices.length;i++)
		{
			System.out.println(prices[i]);
		}
		books[0] = "疯狂Java讲义";
		books[1] = "轻量级Java EE企业应用实战";
		// 使用循环输出books数组的每个数组元素的值
		for (var i=0;i<books.length;i++)
		{
			System.out.println(books[i]);
		}
		
	}
}