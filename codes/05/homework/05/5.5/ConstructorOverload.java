public class ConstructorOverload
{
	public String name;
	public int count;
	
	public ConstructorOverload()
	{
		
	}
	public ConstructorOverload(String name,int count)
	{
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		var oc1 = new ConstructorOverload();
		var oc2 = new ConstructorOverload("‡å‡åJOJO",99999);
		System.out.println(oc1.name + " " + oc1.count);
		System.out.println(oc1.name + " " + oc1.count);
	}
}