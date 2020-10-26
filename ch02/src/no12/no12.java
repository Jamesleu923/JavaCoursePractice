package no12;
import java.util.Scanner;
public class no12 {
	public static void main(String[] args) {

		var console=new Scanner(System.in);
		System.out.printf("請輸入一個1~33數字算階乘,:");
		int NumberLevel=console.nextInt();
		console.close();
		if (NumberLevel>34 || NumberLevel<=0) {
			System.out.printf("無法計算%d!",NumberLevel);
			return;
		}

		System.out.printf("%d!=%d",NumberLevel,  factorial(NumberLevel));
	}
	
	public static int factorial(int NumberLevel) {
		if (NumberLevel>0)
			return NumberLevel*factorial(--NumberLevel);
		else
		   return 1;	
	}
}
