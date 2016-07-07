import java.util.*;

public class Test{
	private static String head;
	private static List<String> list;
	private static int i = 0;
	public static void main(String[] args){
		Test test = new Test();
		list = new ArrayList<String>();
		test.testRec(list);
	}
	
	public void testRec(List list){
		if (i > 5) 
			return;
			head = i + "";
			System.out.println("Before Rec!"+head);
			i++;
			testRec(list);
			list.add(head);
			System.out.println("After Rec! Size"+list.size());
			System.out.println("After Rec! check");
			
			
	}
}