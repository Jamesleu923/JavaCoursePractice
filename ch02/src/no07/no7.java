package no07;
import java.util.*;
import java.util.Scanner;
public class no7 {

	public static void main(String[] args) {
		
		var console=new Scanner(System.in);
		float a,b,c,Max=0,Min=0;
		System.out.println("請輸入三個數字");
		System.out.print("A:");
		a=console.nextFloat();
		System.out.print("B:");
		b=console.nextFloat();
		System.out.print("C:");
		c=console.nextFloat();	
		
		console.close();
		//找最大值
		if (a>=b && a>=c)
			Max=a;
		else if (b>=a && b>=c)
			Max=b;
		else if (c>=a && c>=b)
			Max=c;
		else
			Max=-1;
		
		//找最小值
		if (a<=b && a<=c)
			Min=a;
		else if (b<=a && b<=c)
			Min=b;
		else if (c<=a && c<=b)
			Min=c;
		else
			Min=-1;
		
		System.out.printf("最大值%.2f,最小值%.2f", Max,Min);
	}

}
