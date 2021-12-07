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
		System.out.println(this.name + " 正在吃东西……");
	}
	public void drink()
	{
		System.out.println(this.name + " 正在喝饮料……");
	}
	public void play()
	{
		System.out.println(this.name + " 正在玩游戏……");
	}
	public void sleep()
	{
		System.out.println(this.name + " 正在睡觉……");
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
		Student s = new Student("囧囧JOJO",23,"男","13000000000","安徽科技学院","41473909@qq.com");
		System.out.println("---------------学生信息---------------");
		System.out.println("姓名：" + s.getName() + "\t性别：" + s.getGender() + "\t年龄：" + s.getAge());
		System.out.println("手机号：" + s.getPhone());
		System.out.println("地址：" + s.getAddress());
		System.out.println("电子邮箱：" + s.getEmail());
		System.out.println("---------------学生信息---------------");
		
		s.eat();
		s.drink();
		s.play();
		s.sleep();
	}
}