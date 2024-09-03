package dsa;

import java.util.Scanner;

public class amastrong {
	public static void main(String[] args) {
		int number=0,originalnum,remainder,result=0;
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		originalnum = number;
		while(number!=0) {
			remainder = number%10;
			result += Math.pow(remainder,3);
			number/=10;
			
		}
		if(result == originalnum)
			System.out.println(":its an armstrong");
		else
			
			System.out.println(":its not armstrong");
	}
}
