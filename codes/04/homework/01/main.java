public class main
{
	public static void main(String[] args)
	{
		for (int i=1;i<10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i + "x" + j + "=" + i*j);
				if(j!=i)
				{
					System.out.print(", ");
				}else
				{
					System.out.println();
				}
			}
		}
	}
}