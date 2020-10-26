package no06;
import java.util.ArrayList;
import java.util.List;

public class no6 {

	public static void main(String[] args) {
		 //一群字串變數，等下要跟整數用的，變數名有Int。。。要給長整數用的，變數名有Long
		 //因為是字串變數,所以變數前方都加上str來區別.
		 String StrInt="10",StrFloat="10.2",StrLong="100100100",StrDouble="3.141591689";
		 
		 //等下要接收字串轉型後存放的變數一群~
		 int MyInt1=0, MyInt2=0;
		 float MyFloat1=0, MyFloat2=0;
		 long MyLong1=0,MyLong2=0;
		 double MyDouble1=0, MyDouble2=0;
			 
		 // 二種作法, 一為valueOf,一為parseInt
		 //整數
		 MyInt1=Integer.valueOf(StrInt);
		 MyInt2=Integer.parseInt(StrInt);
		 //浮點數
		 MyFloat1=Float.valueOf(StrFloat);
		 MyFloat2=Float.parseFloat(StrFloat);
		 //長整數
		 MyLong1=Long.valueOf(StrLong);
		 MyLong2=Long.parseLong(StrLong);
		 //倍精度浮點數
		 MyDouble1=Double.valueOf(StrDouble);
		 MyDouble2=Double.parseDouble(StrDouble);
		 
		 //做一個串列來放上面的物件變數。 因為物件變數型別都不一樣.
		 //所以使用 大家的爸爸--->國民父親-->Object類別來宣告.
		 List<Object> MyNumber=new ArrayList<>();
		 MyNumber.add(MyInt1);MyNumber.add(MyInt2);
		 MyNumber.add(MyFloat1);MyNumber.add(MyFloat2);
		 MyNumber.add(MyLong1);MyNumber.add(MyLong2);
		 MyNumber.add( MyDouble1);MyNumber.add(MyDouble2);

		 //做一個函式(方法),印出來看看囉
		 // 函式接收使用?號, 打? 代表型別可以接收Object, String, Integer,.....任何型
		 PrintListContent(MyNumber);

	}
	
	// 做一個可以接收任何型別的list串列函式：PrintListContent,用來印東東.
	// 打? 代表型別可以是Object, String, Integer,.....任何型
	//getClass().getSimpleName().toString(),會根據你的型別回傳是Integer/Float/Long/Double
	//getClass().getName().toString() 會回傳長名
	//但回傳的字,不是字串變數，而是String Builder所建之字串物件.
	// 所以在做字串比較時要用 equals函式來做! 
	// 寫這樣會失敗——＞　elements.getClass().getSimpleName().toString()＝＝"Integer"
	public static void PrintListContent(List<?> MyList) {		
		for (var elements: MyList) {
			if (elements.getClass().getSimpleName().toString().equals("Integer")
					|| elements.getClass().getSimpleName().toString().equals("Long")) {
				System.out.printf("型別:%s,值:%d%n", elements.getClass().getSimpleName(),elements);
			}				
			else {
				System.out.printf("型別:%s,值:%.8f%n", elements.getClass().getSimpleName(),elements);
			}
		}
	}	
}

