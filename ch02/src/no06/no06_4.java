package no06;
// 使用List需引入java.util.*
import java.util.*;
import java.util.Scanner;
public class no06_4 {

	public static void main(String[] args) {
		
		var console=new Scanner(System.in);
		// List串列需使用Float物件型別,而非float 變數型別.大小寫不同有差.
		List <Float> StdScore=new ArrayList<>();
		
		//要使用do..while迴圈輸入，故在此score1,score2..score5改用Float物件陣列型態.
	    //以方便do..while操作
		Float[] score=new Float[5];
		int i=0;
		do {
			System.out.printf("請輸入第%d位學生成績:", i+1);			
			// 你可以先存入陣列,迴圈結束後再一個個方入串列.
			score[i]=console.nextFloat();
			// 或:若不用印出原始分數,則不要用陣列了! 直接用 StdScore.add(console.nextFloat());
			// 取代上面程式,do..while跑完,串列即有資料!更省事! 			
			System.out.printf("%n");
		}while (++i<5);

		//放入串列,若輸入時使用陣列存資料,則還要走訪一次,把資料放入串列
		//若輸入時直接用串列,則下方程式碼不用了!
		for (int j=0; j<score.length;j++)
			StdScore.add(score[j]);
		
		//java 開根號為 Math.sqrt()方法,或用 Math.pow()方法-次方,開根號即為0.5次方.
		//(四). 修改上述程式碼，分數36分(不含36)以下的學生，不予以加權，直接當掉，
		//請使用continue;指令，並判別是否可用for.each迴圈? 或需要改回for迴圈?
		// ---->可直接用for each 做,不用 continue;指令
		for (Float EachScore:StdScore) {
			if (EachScore>=36)
        		EachScore=(float) (Math.sqrt(EachScore)*10);
		}
	
		
		
		//印出資料結果
		System.out.print("五位學生原始成績資料:");
		for (int j=0; j<score.length;j++)
			System.out.printf("第%d位:%.2f-",j+1,score[j]);
		System.out.printf("%n");
		System.out.print("五位學生加權後成績資料:");
		for (Float EachScore:StdScore)
			System.out.printf("%.2f-",EachScore);
		System.out.printf("%n");
	}

}
