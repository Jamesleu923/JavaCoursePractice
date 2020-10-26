package no09;

public class no09 {

	public static void main(String[] args) {
	   String [] CardKind= {"梅花","紅心","紅鑽","黑桃"};
	   String [] CardNumber =new String[13];
	   
	   // 懶得在宣告時一個個打的人可以用以下做法
	   // 初始化PlayCard的A, 2,3,4...J,Q,K
	   for (int i=0;i<CardNumber.length;i++) {
		   if (i==0)
			   CardNumber[i]="A";
		   else if (i==10)
			   CardNumber[i]="J";
		   else if (i==11)
			   CardNumber[i]="Q";
		   else if (i==12)
			   CardNumber[i]="K";
		   else
			   CardNumber[i]=String.valueOf(i+1).toString();
	   }
	   

	   //Math.random() --->
	   // 產生1~13之間的值，可以用：(int) (Math.random()*13) + 1 ;
	   // 產生1~4之間的值，可以用：(int) (Math.random()*4) + 1 ;
	   // 也可以用 餘數方式,產生一亂數*1000, %n取餘數
	   //   (Math.random()*1000) % 13 -->餘數會介於0~12之間, 把餘數加1 ,即得1~13之間的數
	   // 本例資料都放陣列中,陣列起始為0,故不用再加1
		for(int i=0;i<5;i++) {
			int RandomCardKind = ((int) (Math.random()*1000)) % 4  ; //產生從[0,3)
			int RandomCardNumber = ((int) (Math.random()*1000)) % 13  ; //產生從[0,12]
			System.out.print(CardKind[RandomCardKind]+CardNumber[RandomCardNumber]+",");
		}
	}

}
