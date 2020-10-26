package no05;
//本題為陣列存取之熟練度作業
//本題使用隨機取值
import java.util.Random;
public class no05 {

	public static void main(String[] args) throws Exception {
		//(一). 全班共有十個人，計有三科目：國、英、數。所以需要一個10x3陣列存放資料。
		//int[][] score=new int[10][3];
		
		//(二). 由於要計算每位學生的平均成績，故你需要多一個維度，來存放每位同學的平均成績，
		//陣列應改為10x 4的大小，其中，每列的第四個儲存格存放三科的平均數，由電腦for迴圈走訪，自動計算。
		//int[][] score=new int[10][4];
		
		//(三). 由於要計算每科平均分數，所以陣列還要多一列，用來計算各科的平均分數，故大小再調為11 x 4
		float[][] score=new float[11][4];
		Random ran = new Random();
		float StdSum=0;
		float Chinese=0,English=0,MathMath=0;
		boolean ErrorFlag=false;
		//註標0都是放平均分的，所以取值的註標都由１開始
		for (int i=1;i<score.length;i++) {
			   if (ErrorFlag) {
				   throw new Exception("系統錯誤旗標為真,請除錯");				   
			   }				   
			   StdSum=0; //每一位學生進入前,先清空總分
			for(int j=1;j<score[i].length;j++) {
				score[i][j]=ran.nextInt(101);
				StdSum+=score[i][j]; //加總總分
				if (j==1) //國文
					Chinese+=score[i][j];
				else if (j==2) //英文
					English+=score[i][j];
				else if (j==3) //數學
					MathMath+=score[i][j];
				else
					ErrorFlag=true;
				  //印出來看一下隨機取值的結果
				System.out.printf("第%d位學生:", i);
				if (j==3) //每印4個換一列
				     System.out.printf("MyScore[%d][%d]=%.2f%n",i,j,score[i][j]);
				else
				  System.out.printf("MyScore[%d][%d]=%.2f, ",i,j,score[i][j]); 
			}
			//一位學生結束,取出總分算該生的平均,存入註標(x,0)
			score[i][0]=StdSum/3;
		}
		//計算各科平均
		score[0][1]=Chinese/10;
		score[0][2]=English/10;
		score[0][3]=MathMath/10;	
		score[0][0]=(score[0][1]+score[0][2]+score[0][3] )/3;
		
		//全部印出
		System.out.printf("%n%n-----這是全印出--------%n");
		for (int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				TitlePrint(i,j);
				if (j==3) //每印4個換一列
				     System.out.printf("MyScore[%d][%d]=%.2f%n",i,j,score[i][j]);
				else
                    System.out.printf("MyScore[%d][%d]=%.2f, ",i,j,score[i][j]); 
			}
		}
		
		System.out.printf("%n%n-----這是全印出--------%n");
	}
	
	public static void TitlePrint(int i,int j) {
		if(i==0 && j==0)
			  System.out.printf("總平均:");
		if(i==0 && j==1)
			System.out.printf("國文平均:");	
		if(i==0 && j==2)
			System.out.printf("英文平均:");
		if(i==0 && j==3)
			System.out.printf("數學平均:");			
		if (i>0 && j==0)
		   System.out.printf("第%d位學生總平均:", i);
		if (i>0 && j==1)
			   System.out.printf("國文:", i);
		if (i>0 && j==2)
			   System.out.printf("英文:", i);		
		if (i>0 && j==3)
			   System.out.printf("數學:", i);				
	}

}
