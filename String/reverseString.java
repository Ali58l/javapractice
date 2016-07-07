import java.util.*;

public class reverseString{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String mainString = sc.nextLine();
		String reverseStr = new StringBuffer(mainString).reverse().toString();	
		System.out.println(reverseStr);
		boolean result = mainString.equals(reverseStr) ? true : false; 
		System.out.println(result);
	}
}