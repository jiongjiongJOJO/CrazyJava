public class Student
{
	private Person p = new Person();
	public Student(Person p)
	{
		this.p = p;
	}
	
	public void setName(String name)
	{
		p.setName(name);
	}
	public void setAge(int age)
	{
		p.setAge(age);
	}
	public void setGender(String gender)
	{
		p.setGender(gender);
	}
	public void setPhone(String phone)
	{
		p.setPhone(phone);
	}
	public void setAddress(String address)
	{
		p.setAddress(address);
	}
	public void setEmail(String email)
	{
		p.setEmail(email);
	}
	
	public String getName()
	{
		return p.getName();
	}
	public int getAge()
	{
		return p.getAge();
	}
	public String getGender()
	{
		return p.getGender();
	}
	public String getPhone()
	{
		return p.getPhone();
	}
	public String getAddress()
	{
		return p.getAddress();
	}
	public String getEmail()
	{
		return p.getEmail();
	}
	
	public void eat()
	{
		p.eat();
	}
	public void drink()
	{
		p.drink();
	}
	public void play()
	{
		p.play();
	}
	public void sleep()
	{
		p.sleep();
	}
	public static void main(String[] args)
	{
		/*
		private String name;
		private int age;
		private String gender;
		private String phone;
		private String address;
		private String email;
		*/
		Student s = new Student(new Person("���JOJO",23,"��","13000000000","���տƼ�ѧԺ","41473909@qq.com"));
		System.out.println("---------------ѧ����Ϣ---------------");
		System.out.println("������" + s.getName() + "\t�Ա�" + s.getGender() + "\t���䣺" + s.getAge());
		System.out.println("�ֻ��ţ�" + s.getPhone());
		System.out.println("��ַ��" + s.getAddress());
		System.out.println("�������䣺" + s.getEmail());
		System.out.println("---------------ѧ����Ϣ---------------");
		
		s.eat();
		s.drink();
		s.play();
		s.sleep();
	}
}