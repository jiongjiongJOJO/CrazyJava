public class Person
{
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	public Person()
	{

	}
	public Person(String name,int age,String gender,String phone,String address,String email)
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
}