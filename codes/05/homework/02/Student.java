public class Student
{
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	public Student()
	{

	}
	public Student(String name,int age,String gender,String phone,String address,String email)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.address=address;
		this.email=email;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getGender()
	{
		return this.gender;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String getEmail()
	{
		return this.email;
	}
	
	public void eat()
	{
		System.out.println(this.name + " ���ڳԶ�������");
	}
	public void drink()
	{
		System.out.println(this.name + " ���ں����ϡ���");
	}
	public void play()
	{
		System.out.println(this.name + " ��������Ϸ����");
	}
	public void sleep()
	{
		System.out.println(this.name + " ����˯������");
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
		Student s = new Student("���JOJO",23,"��","13000000000","���տƼ�ѧԺ","41473909@qq.com");
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