public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] books = {"������Java EE��ҵӦ��ʵս",
		"���Java����",
		"���Android����"};
		// ʹ��for-eachѭ������������Ԫ�أ�����book�����Զ������������Ԫ��
		for(String book : books)
		{
			System.out.println(book);
		}
		System.out.println();
		for(var book : books)
		{
			System.out.println(book);
		}
		System.out.println();
		for(var book : books)
		{
			book = "���Ajax����";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}