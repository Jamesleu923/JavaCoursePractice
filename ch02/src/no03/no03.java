package no03;
//要引入下方套件,才可以由使用者輸入.
import java.util.Scanner;
//
public class no03 {

	public static void main(String[] args) {
		
		//(一). 請使用new Scanner(System.in)方式產生輸入物件console，由使用者自行在程式中輸入二個字串。
		String[] vstr=new String[2];
		var console=new Scanner(System.in);
		System.out.println("請輸入二組字串:");
		  //使用for 迴圈輸入,或用do..while,請注意,輸入的字串之間不能有空白,不然會視為二組字串。 
		for (int i=0; i<2 ;i++) {
			System.out.printf("請輸入第%d個字串vstr%d：:", i+1,i+1);
			vstr[i]=console.next();
			System.out.println();
		}
		console.close();
		//(二). 請利用字串之length()函式來印出二個字串的長度
		//（列印結果需要含提示說明字組，結果樣態ex：「變數vstr1長度為:XX; 變數vstr2 長度為YY之結果」
				
		System.out.printf("%n變數vstr1長度為:%d; 變數vstr2長度為%d%n",
				vstr[0].length(),vstr[1].length());
		
		//(三). 利用if…else判別式來印出哪一個字串比較長? 哪一個字串比較短?
		if (vstr[0].length()>vstr[1].length()) {
			System.out.printf("變數vstr1長度比較長%n"); 
			}
		else if (vstr[1].length()>vstr[0].length()) {
				System.out.printf("變數vstr2長度比較長%n");
		    }
		else {			
			System.out.printf("二個變數長度一樣長%n");
		  }
		
	}

}
