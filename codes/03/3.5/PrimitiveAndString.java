public class PrimitiveAndString{
	public static void main(String[] args){
		// ��������Ǵ���ģ���Ϊ5��һ������������ֱ�Ӹ��Ƹ�һ���ַ���
		// String str1 = 5;
		// һ���������͵�ֵ���ַ���������������ʱ���������͵�ֵ�Զ�ת��Ϊ�ַ���
		String str2 = 3.5f + "";
		// �������3.5
		System.out.println(str2);
		// ����������7Hello!
		System.out.println(3+4+"Hello!");
		// ����������Hello!34����ΪHello! + 3 ���3�����ַ�������
		// �����ٰ�4�����ַ�������
		System.out.println("Hello!" + 3 + 4);
	}
}