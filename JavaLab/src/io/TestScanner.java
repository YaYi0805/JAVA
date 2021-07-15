package io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入選項:");
		System.out.println("1.XXXX");
		System.out.println("2.XXXX");
		String answer = scanner.nextLine();
		int selection = Integer.parseInt(answer);//轉數字
		System.out.println("使用者輸入的為:"+answer);

	}

}
