public class Ostrich extends Bird
{
	public void fly(){
		System.out.println("��ֻ���ڵ��ϱ��ܡ���");
	}
	public static void main(String[] args)
	{
		var os = new Ostrich();
		os.fly();
	}
	public void callOverrideMethod()
	{
		super.fly();
	}
}