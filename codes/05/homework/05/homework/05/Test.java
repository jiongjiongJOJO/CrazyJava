public class Test
{
	public static void main(String[] args)
	{
		Car c = new Car("奥迪A8",120);
		Train t = new Train("和谐号T101","2021年12月7日11:15:41",320);
		Airplane p = new Airplane("南航CZ6413","2021年12月7日11:16:18",550);
		System.out.println(c.getName() + "\t" + c.getSpeed() + " km/h");
		System.out.println(t.getName() + "\t" + t.getSpeed() + " km/h\t" + t.getTime());
		System.out.println(p.getName() + "\t" + p.getSpeed() + " km/h\t" + p.getTime());
	}
}