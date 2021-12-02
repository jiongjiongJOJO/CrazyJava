public class ForInsteadWhile{
	public static void main(String[] args){
		var count = 0;
		for(;count<10;){
			System.out.println(count);
			count++;
		}
		System.out.println("循环结束!");
		
		int temp = 0;
		for (var i=0;i<10;i++){
			System.out.println(i);
			temp = 1;
		}
		System.out.println("循环结束！");
	}
}