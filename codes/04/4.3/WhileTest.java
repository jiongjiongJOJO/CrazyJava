public class WhileTest{
	public static void main(String[] args){
		var count = 0;
		while(count<10){
			System.out.println(count);
			count++;
		}
		System.out.println("ѭ��������");
		
		// ������һ����ѭ��
		/*
		var count = 0;
		while(count<10){
			System.out.println("��ִͣ�е���ѭ��" + count);
			count--;
		}
		System.out.println("��Զ�޷�������ѭ����");
		*/
		count = 0;
		while(count<10);
		{
			System.out.println("-------" + count);
			count++;
		}
	}
}