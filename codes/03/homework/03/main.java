public class main{
	public static void main(String[] args){
		int a = 97;
		float b = 9.28f;
		double c = 2.19;
		char d= '��';
		byte f = 9;
		short g = 8;
		long h = 99999999999999L;
		// ��λ����λ
		float a1 = (float)c;
		long b1 = (long)b;
		int c1 = (int)h;
		short d1 = (short)a;
		byte e1 = (byte)g;
		char f1 = (char)a;
		System.out.printf("��λ����λ��%f %d %d %d %d %c\n",a1,b1,c1,d1,e1,f1);
		// ��λ����λ
		int a2 = d;
		short b2 = f;
		int c2 = g;
		long d2 = a;
		float e2 = h;
		double f2 = b;
		System.out.printf("��λ����λ��%d %d %d %d %f %f\n",a2,b2,c2,d2,e2,f2);
	}
}