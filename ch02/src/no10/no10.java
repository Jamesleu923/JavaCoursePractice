package no10;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class no10 {
	public static void main(String[] args) {
		
		
		var console=new Scanner(System.in);
		System.out.printf("請輸入你出生西元年:");
		int BirthYear=console.nextInt();
		console.close();
		
		Calendar NowTime = Calendar.getInstance(); 
		int NowYear = NowTime.get(Calendar.YEAR); //，當前年份
		int age=NowYear-BirthYear;
		
		if (age<=0) {
			System.out.printf("你年紀太小!才%d歲,未出生",age);
			return;
		}
		else  if (age>0 && age<6 ){
			System.out.printf("你不用買票%n");
		}
		else  if (age>=6 && age<18 ){
			System.out.printf("你應該買半票%n");
		}
		else  if (age>=18 && age<20 ){
			System.out.printf("你應該買學生票%n");
		}
		else {
			System.out.printf("你應該買全票%n");
		}		
			
		
		
		
		
	}
}
