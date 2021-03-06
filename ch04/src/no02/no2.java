package no02;

import java.util.Arrays;

public class no2 {
	public static void main(String[] args) {
		// 使用ArrayCopyOf，宣告後直接用，不用初始化，方便許多 但限定JDK 6以上版本

		String[] Penghu ={"陽光","沙灘","比基尼"};
		// 舊的System.arrayCopy 方法要先宣告且初始化:String[] nature=new String[2];
		// 舊的System.arrayCopy 方法要先宣告且初始化:String[] human =new String[1];
				
		String[] nature=Arrays.copyOf(Penghu, 2);
		String[] human=Arrays.copyOfRange(Penghu,2,3);
		//ArraryCopyOF 只要把copy後的結果給宣告的物件,不用初始化
		//Arrays.copyOf(來源陣列名，烤貝的長度); ==>Arrays.copyOf(Penghu, 2); ==>copy前二個字串		
		//Arrays.copyOfRange(來源陣列名, 要複製的啟始索引(包括), 複製結束的最終索引(但不包括) )
		//           -->Arrays.copyOfRange(Penghu,2,3);
		ShowMyArray("Penghu",Penghu);
		ShowMyArray("nature",nature);
		ShowMyArray("human",human);
	}
	
    public static void ShowMyArray(String ArrayName,String[] Array) {	    	
    	System.out.printf("陣列名稱:%s, 內容有:",ArrayName);
    	for (String elements :Array)
    		System.out.printf(" %s ,",elements);
    	
    	System.out.println(".");
    }
}
