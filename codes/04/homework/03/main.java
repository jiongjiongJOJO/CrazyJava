import java.lang.Math;

public class main
{
	public static void main(String[] args)
	{
		int r = 10;
		// Ô²ÐÄ×ø±ê£¨5,5£©£¬Ô²µã£¨0,0£©
		for(int i=0;i<=2*r;i+=2)
		{
			for (int j=0;j<=2*r;j++)
			{
				double l = Math.sqrt((i-r)*(i-r) + (j-r)*(j-r));
				if(Math.abs(l-r) <= 0.3)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
