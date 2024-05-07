package com.kh.test.main;

import java.util.Scanner;

/*
 * 키보드로 1개의 정수형
 * 데이터를 입력받아 1부터 5까지 일때만 해당 숫자에 해당하는 결과를 출력한다
 * 단 switch문을 이용한다.
 * switch case 문 작성
 */

public class Test6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("1~5까지 숫자를 입력해주세요 :");
		int nyorong=sc.nextInt();
		switch(nyorong) {
		case 1: 
			System.out.println("입력이 정상적으로 되었습니다");
				break;
		case 2: 
			System.out.println("조회가 시작되었습니다.");
			break;
		case 3: 
			System.out.println("수정이 정상적으로 되었습니다.");
			break;
		case 4: 
			System.out.println("삭제가 정상적으로 되었습니다.");
			break;
		case 5: 
			System.out.println("정상적으로 종료되었습니다");
			return;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		 
	}
}
