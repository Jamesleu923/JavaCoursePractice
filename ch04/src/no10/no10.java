package no10;
import java.util.*;
public class no10 {

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
	   

	   //java.util.Random--->
	   // 建構子提供直接將亂數種子設入，如下:用10
	    Random MyRandom1 = new Random(10);
	   //也可以用MyRandom2.setSeed(long 種子);
	   // 本程式用時間當種子,每次時間都不同,故出現的牌也會不同
	    Random MyRandom2 = new Random();
	    MyRandom2.setSeed(new Date().getTime());
	    //產生從[0,10)
	    System.out.println(MyRandom1.nextInt(10));
        //產生隨機布林
	    System.out.println(MyRandom1.nextBoolean());
	    ////N(0,1)的常態分配(高斯分配)
	    System.out.println(MyRandom1.nextGaussian());
	    
	   //本題要 產生0~3, 0~12之間的值
		for(int i=0;i<5;i++) {
			int RandomCardKind = (int) (MyRandom2.nextInt(4));  ; //產生從[0,3],不含尾數3
			int RandomCardNumber = (int) (MyRandom2.nextInt(13)); ; //產生從[0,12],不含尾數13
			  System.out.print(CardKind[RandomCardKind]+CardNumber[RandomCardNumber]+",");
		}
	}

}