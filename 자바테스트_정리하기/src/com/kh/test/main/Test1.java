
package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/* 키보드 1개의 정수형 데이터를 받아
		 * 
		 * 1~100 사이의 값일때만 2의 배수인지 아닌지를 출력 처리한다 
		 */
		Scanner 스캐너 = new Scanner(System.in);
	
		//만약에 숫자가 1보다 크고 100보다 사이일때 연산자 
		//2의 배수인지 아닌지  if else 확인 

        //1~100 사이가 아니가 아니면 1~100사이 값만 입력해주세요 . 출력 
		while(true) {
			System.out.print("종료버튼 9999\n숫자입력 :");
			int 숫자 =스캐너.nextInt();
			if(숫자>=1 && 숫자<=100 ) {
				if((숫자%2)==0) {
					System.out.println(숫자+"은 2의 배수입니다.");
				 }
				else { 
					System.out.println(숫자+"은 2의 배수가 아닙니다.");
					
				}
			}else if(숫자==9999) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			else {
				System.out.println("1과 100의 숫자만 입력해주세요");
				
			}
		}
		
	 
		 
		
		
		
		
	}
	  

}
