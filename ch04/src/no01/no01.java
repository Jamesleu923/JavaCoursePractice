package no01;
/*
String[] Penghu={“陽光”,”沙灘”,”比基尼”};
使用System.arraycopy() 方法，
把上述陣列第0及第1個元素copy到nature陣列中; 
另把把上述陣列第2個元素copy到 human陣列中。
最後，把nature及human二個陣列內容，使用for each印出來。
 * 
 */
public class no01 {

	public static void main(String[] args) {
		String[] Penghu ={"陽光","沙灘","比基尼"};
		String[] nature=new String[2];
		String[] human =new String[1];
		
		//System.arraycopy(來源, 起始索引, 目的, 起始索引, 複製長度)
		System.arraycopy(Penghu,0, nature, 0, 2);
		System.arraycopy(Penghu, 2, human, 0, 1);
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
