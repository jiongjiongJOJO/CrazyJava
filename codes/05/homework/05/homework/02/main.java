public class main
{
	public Student searchByName(Student[] list,String name)
	{
		for(Student s : list)
		{
			if(s.getName() == name)
			{
				return s;
			}
		}
		return new Student();
	}
	public Student searchByEmail(Student[] list,String email)
	{
		for(Student s:list)
		{
			if(s.getEmail() == email)
			{
				return s;
			}
		}
		return new Student();
	}
	public Student searchByAddress(Student[] list,String address)
	{
		for(Student s:list)
		{
			if(s.getAddress() == address)
			{
				return s;
			}
		}
		return new Student();
	}
	public void printInfo(Student s)
	{
		System.out.println("---------------学生信息---------------");
		System.out.println("姓名：" + s.getName() + "\t性别：" + s.getGender() + "\t年龄：" + s.getAge());
		System.out.println("手机号：" + s.getPhone());
		System.out.println("地址：" + s.getAddress());
		System.out.println("电子邮箱：" + s.getEmail());
		System.out.println("---------------学生信息---------------");
	}
	
	public static void main(String[] args)
	{
		main m = new main();
		Student[] s = new Student[5];
		// Student(String name,int age,String gender,String phone,String address,String email)
		s[0] = new Student("张三",23,"男","13888888888","地址1","email1@email.com");
		s[1] = new Student("李四",24,"男","13666666666","地址2","email2@email.com");
		s[2] = new Student("王二",22,"男","13999999999","地址3","email3@email.com");
		s[3] = new Student("海绵宝宝",35,"男","13777777777","地址4","email4@email.com");
		s[4] = new Student("派大星",40,"男","13000000000","地址5","email5@email.com");
		
		Student result;
		result = m.searchByName(s,"派大星");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByName(s,"章鱼哥");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
		
		
		result = m.searchByEmail(s,"email2@email.com");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByEmail(s,"41473909@qq.com");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
		
		
		result = m.searchByAddress(s,"地址4");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByAddress(s,"地址40");
		if(result.getName() == null)
		{
			System.out.println("抱歉，未查到相应的联系人");
		}else
		{
			m.printInfo(result);
		}
	}
}