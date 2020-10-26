package no11;
import java.util.Scanner;
public class no11 {
	public static void main(String[] args) throws Exception {

		var console=new Scanner(System.in);
		System.out.printf("請輸入一個1~33數字算階乘,:");
		int NumberLevel=console.nextInt();
		console.close();
		if (NumberLevel>=34 || NumberLevel<=0) {
			System.out.printf("無法計算%d!",NumberLevel);
			return;
		}
		
	    var result=1;
		//十一、 在不使用遞迴的狀況下,寫一個程式，由使用者輸入一個數字，使用for迴圈計算其階乘值。（ex: 4!=4x3x2x1=24 ）
		for (int i=1; i<=NumberLevel;i++)
			result*=i;
		
		//2020.20.26 修正:算到負值即為超過值域,要拋出錯誤.
		if (result>0)
		    System.out.printf("%d!=%d", NumberLevel,result);
		else					
			throw new Exception("System.Error!系統錯誤,超過值域 ");
		
	}
}
