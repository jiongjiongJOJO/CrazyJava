public class WhileTest{
	public static void main(String[] args){
		var count = 0;
		while(count<10){
			System.out.println(count);
			count++;
		}
		System.out.println("循环结束！");
		
		// 下面是一个死循环
		/*
		var count = 0;
		while(count<10){
			System.out.println("不停执行的死循环" + count);
			count--;
		}
		System.out.println("永远无法跳出的循环体");
		*/
		count = 0;
		while(count<10);
		{
			System.out.println("-------" + count);
			count++;
		}
	}
}