package no09;
import java.util.Scanner;
public class no9 {
	public static void main(String[] args) {
		

		
		var console=new Scanner(System.in);
		System.out.printf("請輸入1~7:");
		int No=console.nextInt();
		console.close();
	       //本例子為不使用陣列狀況下,練習if..else if ..else if..else語法
		   //注意: if與 else中間,可以有無限個 else if ,但最後一個一定要是else
		   // 真實世界應用,應參考第三章的第2題,使用陣列解題
		
		if (No<=0 || No>7) {
			System.out.println("數量錯誤,程式結束!");
			return;
		}
		else if (No==1) {
			System.out.printf("%n 星期一");
		}
		else if (No==2) {
			System.out.printf("%n 星期二");
		}
		else if (No==3) {
			System.out.printf("%n 星期三");
		}
		else if (No==4) {
			System.out.printf("%n 星期四");
		}
		else if (No==5) {
			System.out.printf("%n 星期五");
		}
		else if (No==6) {
			System.out.printf("%n 星期六");
		}
		else {
			System.out.printf("%n 星期日");
		}		
			
	}
}
