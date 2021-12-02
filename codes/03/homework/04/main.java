/*
* 算术运算符： +,-,*,/,%,++,--
* 赋值运算符： =
* 位运算符：   &,|,~,^,<<,>>,>>>
* 比较运算符： >,<,>=,<=,==,!=
* 逻辑运算符： &&,&,||,|,!,^
*/
public class main{
	public static void main(String[] args){
		System.out.println(1+1);//2
		System.out.println(1+1.0);//2.0
		System.out.println('a' - 1);//96
		System.out.println(10/3);//3
		System.out.println(10/3.0);//3.33333333
		System.out.println(10%3);//1
		System.out.println(10/0.0);//正无穷
		System.out.println(0.0/10);//0.0
		int a = 219;
		System.out.println(a++);//219
		System.out.println(++a);//221
		System.out.println(--a);//220
		System.out.println(a++);//220
		System.out.println("--------------------------------------");
		int b = 8;// 0000 0000 0000 0000 0000 0000 0000 1000
		int c = 6;// 0000 0000 0000 0000 0000 0000 0000 0110
		int d = -5;//1111 1111 1111 1111 1111 1111 1111 1011
		System.out.println(b&c);//0
		System.out.println(b|c);//14
		System.out.println(~b);//-9
		// 1111 1111 1111 1111 1111 1111 1111 0111
		// 1000 0000 0000 0000 0000 0000 0000 1001
		// -9
		System.out.println(~c);//-7
		// 1111 1111 1111 1111 1111 1111 1111 1001
		// 1000 0000 0000 0000 0000 0000 0000 0111
		// -7
		System.out.println(b^c);//14
		System.out.println(b<<1);//16
		System.out.println(d<<1);//-10
		// 1111 1111 1111 1111 1111 1111 1111 0110
		// 1000 0000 0000 0000 0000 0000 0000 1010
		// -10
		System.out.println(c>>1);//3
		System.out.println(d>>1);//-3
		// 1111 1111 1111 1111 1111 1111 1111 1101
		// 1000 0000 0000 0000 0000 0000 0000 0011
		// -3
		System.out.println(b>>>1);//4
		System.out.println(b>>>33);//4
		System.out.println(d>>>1);//2147483645
		// 1111 1111 1111 1111 1111 1111 1111 1101
		// 0111 1111 1111 1111 1111 1111 1111 0010
		// 2147483645
		System.out.println(d>>>33);//2147483645
		System.out.println("--------------------------------------");
		System.out.println('a' > 'c');//false
		System.out.println(10.0==10);//true
		System.out.println("你好" == "你好");//true
		System.out.println(1.354e3 == 1354);//true
		System.out.println(97>='a');//true
		System.out.println(97!='a');//false
		System.out.println(97=='a');//true
		System.out.println("--------------------------------------");
		int e = 10;
		System.out.println(5<3 && e++>10);//false   e=10
		System.out.println(5<3 || --e==10);//false  e=9
		int f = 10;
		System.out.println(5<3 & f++>10);//false   f=11
		System.out.println(5>3 | --f==10);//true  f=10
		System.out.println(!(5>3));//false
		System.out.println("--------------------------------------");
		int g = 5;
		int h = ++g;
		int i = g++;
		System.out.println(g);//7
		System.out.println(h);//6
		System.out.println(i);//6
		System.out.println("--------------------------------------");
	}
}