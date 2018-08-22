package Shixun0;

import java.util.Scanner;

public class p1 {
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		String str1 = sc.nextLine();
		//System.out.println(str1);
		StringBuilder str2 = new StringBuilder(str1);
		System.out.println(str2.reverse().toString());
	}
}
