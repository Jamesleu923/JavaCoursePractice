package no05;

public class no5 {

	public static void main(String[] args) {
		
		System.out.println("用for迴圈");	
		for (int i=2; i<10;i++) {
			for (int j=1;j<10;j++) {
				System.out.printf("%d * %d =%d   ",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.printf("%n%n");
		System.out.println("用do ..while迴圈");				
		int i=2,j=1;
		do {
		   do {
				System.out.printf("%d * %d =%d   ",i,j,i*j);			
		   } while (++j<10);
		   System.out.println();
		   //重設 j 值
		   j=1;
		} while (++i<10);
		
			
	}

}
