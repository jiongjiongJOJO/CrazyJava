import java.util.Arrays;

public class Num2Rmb
{
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	private String[] divide(double num)
	{
		var zheng = (long)num;
		var xiao = (int)((num-zheng)*100);
		return new String[] {zheng+"",xiao+""};
	}
	private String toHanStr(String numStr)
	{
		if(numStr.length()<4)
		{
			String zero = "";
			for (int i=0;i<4-numStr.length();i++)
			{
				zero += "0";
			}
			numStr = zero + numStr;
			return toHanStr(numStr);
		}else if(numStr.length()>4)
		{
			return "您提供的数字字符串大于4位，是无效值。";
		}else
		{
			String result = "";
			for(int i=0;i<4;i++)
			{
				if(result.length()!=0)
				{
					if (!(result.charAt(result.length()-1)=='零' && numStr.charAt(i)==48))
					{
						result += hanArr[numStr.charAt(i)-48];
					}
				}else
				{
					if(numStr.charAt(i)==48)
					{
						continue;
					}
					result += hanArr[numStr.charAt(i)-48];
				}
				if(i!=3 && numStr.charAt(i)!=48)
				{
					result += unitArr[2-i];
				}
			}
			if(result.charAt(result.length()-1)=='零')
			{
				result = result.substring(0,result.length()-1);
			}
			return result;
		}
		
	}

	public static void main(String[] args)
	{
		var nr = new Num2Rmb();
		// 测试把一个浮点数分解成整数部分和小数部分
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		// 测试把一个四位的数字字符串编程汉子字符串
		System.out.println(nr.toHanStr("6109"));
		System.out.println(nr.toHanStr("9"));
		System.out.println(nr.toHanStr("109"));
		System.out.println(nr.toHanStr("6009"));
		System.out.println(nr.toHanStr("0109"));
		System.out.println(nr.toHanStr("6100"));
		System.out.println(nr.toHanStr("6000"));
		System.out.println(nr.toHanStr("600"));
		System.out.println(nr.toHanStr("60"));
	}
	
}