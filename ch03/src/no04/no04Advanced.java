package no04;
//no04.java可以再把程式碼精簡
//本案例說明精簡方法
import java.util.Random;
import java.util.Arrays;
public class no04Advanced {
    static void PrintTypeModel(int i, int score) { 
		  if ((i+1)%5==0) //每印五個換一列
			     System.out.printf("MyScore[%d]=%d%n",i,score);
			  else
				 System.out.printf("MyScore[%d]=%d, ",i,score); 
    }
	public static void main(String[] args) {
		int[] MyScore=new int[15];	
		Random ran = new Random();	
		 for (int i=0 ;i<MyScore.length;i++) {
			  //由0分到100分之間任取一數.  //放入陣列之中			
			  MyScore[i]=ran.nextInt(101);
			  //印出來看一下隨機取值的結果-->印出來換列方法可以精簡,抽出去當一個方法叫: PrintTypeModel
			  PrintTypeModel(i,MyScore[i]);
		}
		
		VisitByFor(MyScore);
		VisitByDoWhile(MyScore); 
		VisitByForEach(MyScore);
		SortByBubble(MyScore);
		SortByJavaArraySort(MyScore);
	}
	
	
	
	//(一). 寫一個可供呼叫，傳入陣列的函式：
    //static void VisitByFor (int[] array) { //  }，
    //其函式程式碼為利用for 迴圈走訪一次，印出全部資料。
	static void VisitByFor (int[] array) { 
		System.out.printf("%n%n-----這是VisitByFor印出的--------%n");
		for (int i=0;i<array.length;i++) {
			// 丟給PrintTypeModel方法處理,不要重寫
			 PrintTypeModel(i,array[i]);
		}
		System.out.printf("-----這是VisitByFor 結束--------%n%n");	
	}
	//(二). 寫一個可供呼叫，傳入陣列的函式
    //static void VisitByDoWhile (int[] array) 
    //其函式程式碼為利用do..while迴圈走訪一次，印出全部資料
	static void VisitByDoWhile (int[] array) { 
		System.out.printf("%n%n-----這是VisitByDoWhile印出的--------%n");
		int i=0;
		do {
			// 丟給PrintTypeModel方法處理,不要重寫
			 PrintTypeModel(i,array[i]);
		} while (++i<array.length);

		System.out.printf("-----這是VisitByDoWhile 結束--------%n%n");	
	}
	//((三). 寫一個可供呼叫，傳入陣列的函式：
    //static void VisitByForEach (int[] array) 
    //其函式程式碼為利用for each迴圈走訪一次，印出全部資料。	
	static void VisitByForEach (int[] array) { 
		System.out.printf("%n%n-----這是VisitByForEach印出的--------%n");
		int i=0;
		for (int EachScore:array) {
			// 丟給PrintTypeModel方法處理,不要重寫
			 PrintTypeModel(i,EachScore);
			 i++;
		}
		System.out.printf("-----這是VisitByForEach 結束--------%n%n");	
	}
	//(四). 寫一個可供呼叫，傳入陣列的函式：
    //static void SortByBubble (int[] array) { // }，
    //其函式程式碼為利用資料結構所學之Bubble排序，把陣列排序過一次印出。
	static void SortByBubble (int[] array) { 
		int temp=0;
		System.out.printf("%n%n-----這是SortByBubbleh印出的--------%n");
		//Bubble排序
		for (int i=0;i<array.length;i++)
			for (int j=0;j<array.length;j++) {
				if (array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
	    //印出	       
		for (int i=0;i<array.length;i++) {
			// 丟給PrintTypeModel方法處理,不要重寫
			 PrintTypeModel(i,array[i]);
		}
		System.out.printf("-----這是SortByBubble 結束--------%n%n");	
	}
	//(五). 寫一個可供呼叫，傳入陣列的函式：
    //static void SortByJavaArraySort (int[] array) 
    //函式程式碼為使用Java內建之排序功能—用法：Array.sort(陣列名稱); 
	//即完成排序。本例使用方式應為Array.sort(array);  [註] 需import java.util.Arrays;
	static void SortByJavaArraySort (int[] array) {
		
		//叫用Java內建Array類別的排序方法,把傳入的array丟進去排
		Arrays.sort(array);
		//排好了,印出來
		System.out.printf("%n%n-----SortByJavaArraySort--------%n");		
		for (int i=0;i<array.length;i++) {
			// 丟給PrintTypeModel方法處理,不要重寫
			 PrintTypeModel(i,array[i]);
		}
		System.out.printf("-----SortByJavaArraySort 結束--------%n%n");			
		
	}
	
}

