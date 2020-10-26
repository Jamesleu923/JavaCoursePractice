package Q03;

class Q03 {

	public static void main(String[] args) {
		int A=7,B=11,C=19;
		char D='Java';		
		char E='物件導向';
		
		System.out.println("A:%d B:%d C:%d D:%c E:%c",A,B,C,D,E);

		//ANS: 
		// 印出時錯誤，因為字元變數一字只能裝一個字母
		// 「Java」、「物件導向」若要放入變數,必需宣告成字串變數
	}

}
