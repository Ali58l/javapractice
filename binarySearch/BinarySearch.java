import java.util.Arrays;
/*
* When we define a List,We define it as List<String> or List<Integer>. so primitives are not use in List.
*/
public class BinarySearch{
	public static void main(String[] args){
		Integer[] data = {2,8,4,5,10,2,1};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println(data[5]);
		System.out.println(Arrays.asList(data).indexOf(8));
		System.out.println(binarySearchInArray(data,8));
	}
	
	public static boolean binarySearchInArray(Integer[] data,Integer num){
		
		
		return binarySearchInArray(data, num, );
	}
}