package no04;
import java.util.Scanner;
public class no4 {

	public static void main(String[] args) {
		
		char[] GradeLevel= {'A','B','C','D','E'};		
		
		var console=new Scanner(System.in);
		System.out.print("請輸入學生分數score:");		
		float score=console.nextFloat();
		console.close();
		
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
			
		// 輸出
		System.out.printf("您輸入的分數為%.2f分，屬於%c級。",score,GradeLevel[i]);
		
	}

}
