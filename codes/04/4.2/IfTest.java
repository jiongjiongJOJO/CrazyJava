public class IfTest{
	public static void main(String[] args){
		var age = 30;
		if(age>20){
			System.out.println("�����Ѿ�����20����\n20�����ϵ���Ӧ��ѧ��е����Ρ���");
		}
		var a = 5;
		
		
		if(a>4)
			System.out.println("a����4");
		else
			System.out.println("a������4");
		
		var b = 5;
		if(b>4)
			System.out.println("b����4");
		else
			b--;
		System.out.println("b������4");
		
		
		var c = 5;
		if(c>4)
			c--;
			//System.out.println("c����4");   ����
		else
			System.out.println("c������4");
	}
}