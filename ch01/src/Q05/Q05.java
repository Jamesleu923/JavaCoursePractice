package Q05;

public class Q05 {

	public static void main(String[] args) {
		byte A;
		short B,C;
		
		A=(byte) -129;
		B=(short) 32768;
		C=-32768;
		
		System.out.printf("A:%d, B:%d,C:%d",A,B,C);

		// A:-129　超過byte型別值域 -128~127，用了強制轉型，印出127
		// B:32768 超過short 型別值域 -32768-32767，用了強制轉型，印出-32768
		// C:-32768 在short 型別值域之間.印出正常
		//A:127, B:-32768,C:-32768
	}

}
