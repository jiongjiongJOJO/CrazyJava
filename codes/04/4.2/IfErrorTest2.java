public class IfErrorTest2{
	public static void main(String[] args){
		var age = 45;
		if(age>20){
			System.out.println("������");
		}
		if(age>40 && !(age>20)){
			System.out.println("������");
		}
		if(age>60 && !(age>20) && !(age>40 && !(age>20))){
			System.out.println("������");
		}
	}
}