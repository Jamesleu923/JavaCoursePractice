package no03;

public class no03_01 {

	public static void main(String[] args) {

		 //本案例是要說明,如果你不會使用陣列,則只能一個個做.
		 //你也無去使用簡便的迴圈來做總和的計算.
		 //註定程式寫到死.
		
		 int no1=1,no2=2,no3=3,no4=4,no5=5;
		 int no6=6,no7=7,no8=8,no9=9,no10=10;
		 int no11=11,no12=12,no13=13,no14=14,no15=15;
		 int no16=16,no17=17,no18=18,no19=19,no20=20;
		 
		 int sum=no1+no2+no3+no4+no5
				 +no6+no7+no8+no9+no10
				 +no11+no12+no13+no14+no15
				 +no16+no17+no18+no19+no20;
		 
		 float avg=sum/20;
		 
		 System.out.printf("總和為:%d,平均為%.2f",sum,avg);

	}

}
