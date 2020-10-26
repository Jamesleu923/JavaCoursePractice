package no04;
import java.util.Scanner;
import java.lang.Math;
public class no04_4 {

	public static void main(String[] args) {
			
		var console=new Scanner(System.in);
		System.out.print("請輸入學生分數score:");		
		float score=console.nextFloat();
		console.close();
			
		// 輸出, 改叫用JudegIf函式(方法)
		System.out.printf("JudegIf:您輸入的分數為%.2f分，屬於%c級。%n",score,JudgeIf(score));
		// 輸出, 改叫用JudgeSwitch函式(方法)
		System.out.printf("JudgeSwitch:您輸入的分數為%.2f分，屬於%c級。%n",score,JudgeSwitch(score));
	}

	public static char JudgeSwitch(float score) {
		
		char RtnGrade='E';	
		//註標,設為-1
		int i=-1;	
		//取得正確之GradeLevel 註標
		if (score>=90)
			i=0;
		else if (score<90 && score>=80) 
			i=1;
		else if (score<80 && score>=70) 
			i=2;
		else if (score<70 && score>=60) 
			i=3;
		else 
			i=4;
		
		// 使用switch case取代字元陣列
		switch (i) {
		   case 0:
			   RtnGrade='A';
			   break;
		   case 1:
			   RtnGrade='B';
			   break;
		   case 2:
			   RtnGrade='C';
			   break;
		   case 3:
			   RtnGrade='D';
			   break;
		   default:
			   RtnGrade='E';
			   break;			   
		}
		
		return RtnGrade;
	}
	public static char JudgeIf(float score) {
		
		char[] GradeLevel= {'A','B','C','D','E'};	
		//註標,設為-1
		int i=-1;
		
		//取得正確之GradeLevel 註標
		if (score>=90)
			i=0;
		else if (score<90 && score>=80) 
			i=1;
		else if (score<80 && score>=70) 
			i=2;
		else if (score<70 && score>=60) 
			i=3;
		else 
			i=4;
		
		return GradeLevel[i];
	}
}
