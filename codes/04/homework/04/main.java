import java.util.Arrays;
import java.io.*;

public class main
{
	private String subString(String str,int beginIndex, int endIndex)
	{
		byte[] bt=str.getBytes();
		byte[] new_bt = new byte[endIndex-beginIndex];
		for(int i=beginIndex,j=0;i<endIndex;i++)
		{
			new_bt[j++] = bt[i];
		}
		return (new String(new_bt));
	}
	public static void main(String[] args)
	{
		var m = new main();
		String str = "ÖÐ¹úabc";
		System.out.println(m.subString(str,2,5));
	}
}