public class Test
{
	public static void main(String[] args)
	{
		Car c = new Car("�µ�A8",120);
		Train t = new Train("��г��T101","2021��12��7��11:15:41",320);
		Airplane p = new Airplane("�Ϻ�CZ6413","2021��12��7��11:16:18",550);
		System.out.println(c.getName() + "\t" + c.getSpeed() + " km/h");
		System.out.println(t.getName() + "\t" + t.getSpeed() + " km/h\t" + t.getTime());
		System.out.println(p.getName() + "\t" + p.getSpeed() + " km/h\t" + p.getTime());
	}
}