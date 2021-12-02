class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("父类的普通方法");
	}
	public void test()
	{
		System.out.println("父类的被覆盖的方法");
	}
}
public class SubClass extends BaseClass
{
	public String book = "轻量级Java EE企业应用实战";
	public void test()
	{
		System.out.println("子类的覆盖父类的方法");
	}
	public void sub()
	{
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);
		ploymophicBc.base();
		ploymophicBc.test();
		// ploymophicBc.sub(); //因为子类中有，但父类没有，所以会报错。
		
		// 编译器推断出v1是SubClass类型
		var v1 = new SubClass();
		// 由于ploymophicBc的编译时类型是BaseClass，因此编译器推断出v2是BaseClass类型
		var v2 = ploymophicBc;
		// 由于ploymophicBc类没有提供sub方法，所以下面代码编译时会出现错误
		// v2.sub();
	}
}
