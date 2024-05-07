package com.kh.test.main;

import java.util.Scanner;

/*키보드로 2개의 정수형 데이터를 입력받아
 * 두수가 모두 1부터 9까지의 수일때만
 * 두수의 곱이 한자리수인지 두자리수인지 출력한다. 
 */
public class Test5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("두 정수를 입력하세요");
	int 숫자1=sc.nextInt();
	int 숫자2=sc.nextInt();
	//두 수가 모두 1부터 9까지의 수인지 한번에 확인
	if((숫자1>=1 && 숫자2<=9) &&(숫자2>=1 &&숫자2<=9)) {
		//두수가 1~0일때 곱하기
		int 곱=숫자1*숫자2;
		
		//두수의 곱이 한자리 수인지 두자리 수인지 확인
		if(곱>=1&&곱<=9) {
			System.out.println("합은"+곱+"로 한자리 수 입니다.");
		}else {
			System.out.println("합은 "+곱+"로 두자리 수 입니다.");
		}
		
		
	}else {
		System.out.println("입력한 수 중에 1~9가 아닌 수가 있습니다.");
	}
	
}
}
