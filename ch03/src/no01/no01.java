package no01;

public class no01 {

	public static void main(String[] args) {
		
		//陣列倒印方式有很多,如使用堆疊,或用其他java.util功能.
		//本案例是要給同學練習用for倒迴圈
		int[] number= {10,20,30,40,50,60};
		System.out.printf("陣列倒印:%n");
		for (int i=number.length-1;i>=0;i--)
			System.out.printf("number[%d]=%d%n",i,number[i]);
	}

}
