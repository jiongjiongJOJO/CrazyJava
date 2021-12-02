public class VariableOverrideTest
{
	private String name = "‡å‡åJOJO";
	private static double price = 78.0;
	public static void main(String[] args)
	{
		var price = 65;
		System.out.println(price);
		
		System.out.println(VariableOverrideTest.price);
		new VariableOverrideTest().info();
	}
	public void info()
	{
		var name = "º£Ãà±¦±¦";
		System.out.println(name);
		System.out.println(this.name);
	}
}