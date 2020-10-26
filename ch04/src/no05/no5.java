package no05;
/*
取得字元-子字串
字串指定位置的字元：char c=str.charAt(指定位置);
指定位置的子字串：str.substring(起始位置[,結束位置+1]);  //指定取出的起始位和結束位置(不含)
分離字串成字元陣列：str.toCharArray();
取出子字串並插入另一陣列中且指定插入位置：str2.getChars(6, 10, cary, 2);//指定取出的起始位和結束位置(不含)
★不能超出陣列的長度
*/
public class no5 {

	public static void main(String[] args) {
		String str1 = "I love Java.";
		String str2 = "enjoy Java.";

		char cin = str1.charAt(7);
		String str3 = str2.substring(6, 10);
		System.out.println("I love Java.第6字元是：" + cin);
		System.out.println("enjoy Java.取出6~10之子字串" + str3);
		char[] cary = str1.toCharArray();
		for (char charAry : cary) {
		   System.out.print("字元陣列：" + charAry + "\t");
		}
		str2.getChars(6, 10, cary, 2);
		System.out.println(cary);
	}

}
