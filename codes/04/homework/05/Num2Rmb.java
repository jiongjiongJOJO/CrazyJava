import java.util.Arrays;

public class Num2Rmb
{
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	private String[] unitArr2 = {"元","万","亿"};
	
	private String[] divide(double num)
	{
		var zheng = (long)num;
		var xiao = (int)((num-zheng)*100);
		return new String[] {zheng+"",xiao+""};
	}
	private String[] split(String str)
	{
		// 236711125
		// 2,3671,1125
		int len = str.length()%4==0?str.length()/4:(int)(str.length()/4)+1;//3
		String temp = "";
		String[] result = new String[len];
		for (int i=str.length()-1,j=len-1;i>=0;i--) //8,7,6,5,4,3,2,1,0
		{
			temp = str.charAt(i) + temp;
			if(temp.length()==4)
			{
				result[j] = temp;
				--j;
				temp = "";
			}
		}
		if(temp.length()!=0)
		{
			result[0] = temp;
		}
		return result;
	}
	private String combine(String[] strList)
	{
		//2,3671,1125
		String result = "";
		for(int i=strList.length-1;i>=0;i--)//2,1,0
		{
			result = strList[i] + unitArr2[2-i] + result;
		}
		return (result);
	}
	private String fen(String str)
	{
		// 零角零分
		// 零角壹分
		// 壹角零分
		// 壹角壹分
		while(str.length()<2)
		{
			str += "0";
		}
		str = hanArr[str.charAt(0)-48] + "角" + hanArr[str.charAt(1)-48] + "分";
		str = str.replace("零角","");
		str = str.replace("零分","");
		return str;
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
		String[] rmb = nr.divide(2_3671_1125.50);
		String[] strList = nr.split(rmb[0]);
		for (int i=0;i<strList.length;i++)
		{
			strList[i] = nr.toHanStr(strList[i]);
		}
		String yuan = nr.combine(strList);
		String fen = nr.fen(rmb[1]);
		System.out.println(yuan + fen);
	}
}