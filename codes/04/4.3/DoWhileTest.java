public class DoWhileTest{
	public static void main(String[] args){
		var count = 1;
		do{
			System.out.println(count);
			count++;
		}while(count < 10);
		System.out.println("ѭ��������");
		
		var count2 = 20;
		do
		System.out.println(count2++);
		while(count2<10);
		System.out.println("ѭ��������");
	}
}