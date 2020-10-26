package no08;
//排序必要引入的類別
import java.util.Arrays;
public class no8 {

	public static void main(String[] args) {
	    int[] MyArray = {9,8,7,2,3,4,1,0,6,5};

	    // 印出原本樣式
	    System.out.print("MyArray陣列內容:");
	    for (int number : MyArray) {
	      System.out.printf(" %d ," , number);
	    }
	    System.out.println();

	    // 排序!
	    Arrays.sort(MyArray);

	    // 印出排序後結果!
	    System.out.print("排序後陣列內容 :");
	    for (int number : MyArray) {
		      System.out.printf(" %d ," , number);
	    }
	    System.out.println();
	  }
	}