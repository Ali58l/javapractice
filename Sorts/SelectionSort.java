import java.util.*;
public class SelectionSort{

	public static void main(String[] args) {
		int[] array = {12, 35, 87, 26, 9, 28, 7};
		selectionSort(array);
		System.out.println("Sorted Array: " + Arrays.toString(array));
	}
	
	public static void selectionSort(int[] array){
		if ( array == null || array.length < 2) return;
		int n = array.length;
		for (int i = 0; i < n - 1   ; i++){
			int minIndex = i;
			for (int j = i+ 1; j < n ;j++){
				if ( array[j] < array[minIndex] ){
					minIndex = j;
				}
			}
			if ( minIndex !=i && array[i] != array[minIndex] ){
				swap(array, i , minIndex);
			}
		}
	}
	
	public static void swap(int[] array,int i, int j){
		int temp = array[i];
		array[i] = array [j];
		array[j] = temp;
	}
}