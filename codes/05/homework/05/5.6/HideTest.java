class Parent
{
	public String tag = "���Java����";
}
class Derived extends Parent
{
	private String tag = "������Java EE��ҵӦ��ʵս";
}
public class HideTest
{
	public static void main(String[] args)
	{
		var d = new Derived();
		// System.out.println(d.tag);
		System.out.println(((Parent)d).tag);
	}
}