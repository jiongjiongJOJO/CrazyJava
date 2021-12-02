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
		System.out.println("---------------ѧ����Ϣ---------------");
		System.out.println("������" + s.getName() + "\t�Ա�" + s.getGender() + "\t���䣺" + s.getAge());
		System.out.println("�ֻ��ţ�" + s.getPhone());
		System.out.println("��ַ��" + s.getAddress());
		System.out.println("�������䣺" + s.getEmail());
		System.out.println("---------------ѧ����Ϣ---------------");
	}
	
	public static void main(String[] args)
	{
		main m = new main();
		Student[] s = new Student[5];
		// Student(String name,int age,String gender,String phone,String address,String email)
		s[0] = new Student("����",23,"��","13888888888","��ַ1","email1@email.com");
		s[1] = new Student("����",24,"��","13666666666","��ַ2","email2@email.com");
		s[2] = new Student("����",22,"��","13999999999","��ַ3","email3@email.com");
		s[3] = new Student("���౦��",35,"��","13777777777","��ַ4","email4@email.com");
		s[4] = new Student("�ɴ���",40,"��","13000000000","��ַ5","email5@email.com");
		
		Student result;
		result = m.searchByName(s,"�ɴ���");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByName(s,"�����");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
		
		
		result = m.searchByEmail(s,"email2@email.com");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByEmail(s,"41473909@qq.com");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
		
		
		result = m.searchByAddress(s,"��ַ4");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
		result = m.searchByAddress(s,"��ַ40");
		if(result.getName() == null)
		{
			System.out.println("��Ǹ��δ�鵽��Ӧ����ϵ��");
		}else
		{
			m.printInfo(result);
		}
	}
}