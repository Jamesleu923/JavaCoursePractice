package no02;
import java.util.Scanner;
public class no02 {
	public static void main(String[] args) {
		
		String[] WeekDay= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日" } ;
		
		var console=new Scanner(System.in);
		System.out.printf("請輸入1~7:");
		int No=console.nextInt();
		console.close();		
		if (No<=0 || No>7) {
			System.out.println("數量錯誤,程式結束!");
			return;
		}
		else {
			System.out.printf("%n 您輸入%d,所以印出%s %n",No,WeekDay[No-1]);
		}

	}
}
