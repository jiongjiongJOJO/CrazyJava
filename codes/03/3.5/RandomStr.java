public class RandomStr{
	public static void main(String[] args){
		// ����һ�����ַ���
		var result = "";
		//����6��ѭ��
		for (var i = 0;i<6;i++){
			//����һ��97~122֮���int��������
			var intVal = (int)(Math.random()*26+97);
			// ��intVal ǿ��ת��Ϊchar���ͺ����ӵ�result����
			result = result + (char)intVal;
		}
		System.out.println(result);
	}
}