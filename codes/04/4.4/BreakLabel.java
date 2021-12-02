public class BreakLabel
{
	public static void main(String[] args)
	{
		// 外层循环，outer作为标识符
		outer:
		for (var i = 0; i<5;i++)
		{
			for (var j=0 ;j<3;j++)
			{
				System.out.println("i的值为："+i+" j的值为："+j);
				if(j==1)
				{
					break outer;
				}
			}
			System.out.println("内层循环结束！");
		}
		System.out.println("外层循环结束！");
	}
}