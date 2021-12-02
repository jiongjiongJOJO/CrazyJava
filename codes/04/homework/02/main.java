public class main
{
	public static void main(String[] args)
	{
		int num = 4;
		for(int i=1;i<=num;i++)//1,2,3,4
		{
			for (int j=0;j<num-i;j++)//3,2,1,0
			{
				System.out.print(" ");
			}
			
			for (int j=0;j<2*i-1;j++)//1,3,5,7
			{
				System.out.print("*");
			}
			
			
			for (int j=0;j<num-i;j++)//3,2,1,0
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
D:\Users\JOJO\Desktop\Code\Study\Java\CrazyJava\codes\04\homework\02>javac main.java

D:\Users\JOJO\Desktop\Code\Study\Java\CrazyJava\codes\04\homework\02>java main
          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
*********************

D:\Users\JOJO\Desktop\Code\Study\Java\CrazyJava\codes\04\homework\02>javac main.java

D:\Users\JOJO\Desktop\Code\Study\Java\CrazyJava\codes\04\homework\02>java main
   *
  ***
 *****
*******
*/