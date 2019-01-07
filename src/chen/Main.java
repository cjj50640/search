package chen;

import org.junit.Test;

import static chen.OrderSearch.orderSearch;
import static chen.BinarySearch.binarySearch;
import static chen.BlockSearch.blockSearch;

public class Main {
	
	private static final int size = 10;
	private static final int index = 3;
	
	@Test
	public void TestOrderSearch(){
		int[] array = initArray();
		int searchKey = array[index];
		init(searchKey, array);
		int result = orderSearch(searchKey, array);
		System.out.println("位于： " + (result + 1));
	}
	
	@Test
	public void TestBinarySearch(){
		int[] array = initArray();
		int searchKey = array[index];
		init(searchKey, array);
		int result = binarySearch(searchKey, array);
		System.out.println("位于： " + (result + 1));
	}
	
	@Test
	public void TestBlockSearch(){
		int[] array = new int[]{2, 4, 7, 11, 23, 44};
		int[] block = new int[]{7, 44};
		int searchKey = 7;
		init(searchKey, array);
		int result = blockSearch(block, array, searchKey, 3);
		System.out.println("位于： " + (result + 1));
	}
	
	
	
	static int[] initArray(){
		int[] Array = new int[size];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int)Math.round(Math.random() * 100);
		}
		return Array;
	}
	
	static void print(int[] array){
		for(int num: array){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	static void init(int searchKey,int[] array){
		System.out.print("排序前：  ");
		print(array);
		System.out.println("查询的值： " + searchKey);
		insertSort(array);
		System.out.print("排序后: ");
		print(array);
	}
	
	static void insertSort(int[] numbers){
		int size = numbers.length;
		int temp;
		int j = 0;
		
		for (int i = 0; i < size; i++) {
			temp = numbers[i];
			for(j = i; j > 0 && temp < numbers[j - 1]; j--){
				numbers[j] = numbers[j - 1];
			}
			numbers[j] = temp;
		}
	}

}
