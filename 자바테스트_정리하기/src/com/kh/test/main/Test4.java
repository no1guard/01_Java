package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 1부터 9까지 값을 스캐로 각각 입력받아 
		 
		 더하기 빼기 곱하기 몫 출력하기
		 
		 int  숫자1
		 int  숫자2
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1부터 9까지 숫자를 입력하세요 : ");
			int 숫자1= sc.nextInt();
			System.out.print("1부터 9까지 숫자를 입력하세요 : ");
			int 숫자2= sc.nextInt();
			
			if ((숫자1<1 || 숫자1>9)||(숫자2<1 || 숫자2>9)) {
				System.out.println("잘못 입력하였습니다 다시 입력하세요 ");
			}else if((숫자1>=1 || 숫자1<=9)&&(숫자2>=1 || 숫자2<=9)) {
				int sum=숫자1+숫자2;
				int def=숫자1-숫자2;
				int 곱= 숫자1*숫자2;
				int 나누기=숫자1/숫자2;
				System.out.println(숫자1+"+"+숫자2+"="+sum);
				System.out.println(숫자1+"-"+숫자2+"="+def);
				System.out.println(숫자1+"X"+숫자2+"="+곱);
				System.out.println(숫자1+"/"+숫자2+"="+나누기);
				System.out.println("안녕하세요 \"안녕하세요\"");
				
				return;
				
			}
			
		}
		
		
	}

}
