package no08;
import java.util.Scanner;
public class no8 {

	public static void main(String[] args) {
		var console=new Scanner(System.in);
		System.out.printf("請輸入您要買的書本數量:");
		int BookNo=console.nextInt();
		console.close();
		if (BookNo<=0) {
			System.out.println("數量錯誤,程式結束!");
			return;
		}
		
		int TotalCash=0;
		
		if (BookNo<50)
			TotalCash=BookNo*800;
		else if (BookNo>=50  && BookNo<=100)
			TotalCash=BookNo*760;
		else if (BookNo>=101  && BookNo<=150)
			TotalCash=BookNo*720;
		else if (BookNo>=151  && BookNo<=200)
			TotalCash=BookNo*680;
		else 
			TotalCash=BookNo*640;		

		System.out.printf("%n您總共買%d本書,總價是%d元%n", BookNo,TotalCash);
	}

}
