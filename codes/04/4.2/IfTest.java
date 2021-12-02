public class IfTest{
	public static void main(String[] args){
		var age = 30;
		if(age>20){
			System.out.println("年龄已经大于20岁了\n20岁以上的人应该学会承担责任……");
		}
		var a = 5;
		
		
		if(a>4)
			System.out.println("a大于4");
		else
			System.out.println("a不大于4");
		
		var b = 5;
		if(b>4)
			System.out.println("b大于4");
		else
			b--;
		System.out.println("b不大于4");
		
		
		var c = 5;
		if(c>4)
			c--;
			//System.out.println("c大于4");   报错
		else
			System.out.println("c不大于4");
	}
}