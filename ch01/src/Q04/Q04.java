package Q04;

public class Q04 {

	public static void main(String[] args) {
		
		float MaxU,MinU,AvgU;
		double DouA,DouB;
		
	    MaxU=7.23f; MinU=11.32f; AvgU=3.19f;
	    DouA=4.44; DouB=2.33;
	    		
	    System.out.printf("MaxU:%f,MinU:%f,AvgU:%f,DouA:%f,DouB:%f", 
	    		MaxU,MinU,AvgU,DouA,DouB);	
	    
	    //說明:Java 預設的浮點數都是double型別,故若要放入float型別時,
	    //須於數值後面打個 f 代表要轉型成float.
	    //此用法在 C# 也一樣.

	}

}
