package no03;

public class no03_02 {

	public static void main(String[] args) {

		 //改用陣列做,easy多了!
		
		 int[] score=new int[20];

		 /*
		  * 這些全用for迴圈
		 int no1=1,no2=2,no3=3,no4=4,no5=5;
		 int no6=6,no7=7,no8=8,no9=9,no10=10;
		 int no11=11,no12=12,no13=13,no14=14,no15=15;
		 int no16=16,no17=17,no18=18,no19=19,no20=20;
		 
		 */
		 for (int i=0;i<20;i++)
			 score[i]=i+1;		 
		 
		 /*
		 int sum=no1+no2+no3+no4+no5
				 +no6+no7+no8+no9+no10
				 +no11+no12+no13+no14+no15
				 +no16+no17+no18+no19+no20;
		 這些全用for迴圈
		 */
		 int sum=0;
		 for (int i=0;i<20;i++)
			  sum+=score[i];
		 
		 float avg=sum/20;		 
		 System.out.printf("總和為:%d,平均為%.2f",sum,avg);

	}

}

/* (三). 比較二種寫法的優劣，請寫文字說明，至少50字，不超過200字。
  no03_01,no03_02很明顯地,證明學會用陣列+迴圈的有多重要! 
  當你不會用陣列存資料,你也無法使用迴圈來處理資料,程式要打很長很長又不好維護.
  
*/