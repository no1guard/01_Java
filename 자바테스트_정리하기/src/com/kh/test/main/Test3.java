package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//1부터 100까지의 모든 정수들의 합과 평균 구하기 
		 
		int 시작숫자 =1; 
		int 숫자합=0;
	
		int 카운트=0;
		while (시작숫자<=100) {
			숫자합+=시작숫자;
			시작숫자++;
			카운트++;
			}
		double 평균=(double) 숫자합/카운트;
		System.out.println(평균);
		System.out.println(숫자합);
	
		
		
		
		
		
		
		
		
		
		
		
		
		//while문을 사용해서 switch 문 계속 숫자 작성하게 만들어주고 
		//case 3:  종료  만들어주기 
		/*Scanner sc = new Scanner(System.in);
		boolean 계속 =true;
		String 할일="";
		while(계속) {
			
			 
			System.out.print("숫자 작성 :  (3번 누를시 프로그램 종료)");
			
			int 날짜 = sc.nextInt();
			 
			switch(날짜) {
			case 1: 
				할일 = "월요일 : 업무";
				break;
			case 2: 
				할일 = "화요일 : 공부";
				break;
			case 3:
				System.out.println("종료합니다.");
				//return;
				계속=false;
				break;
			default : 
				할일= "날짜와 관계없이 휴식";
				break;
			}
			System.out.println("일정 : "+할일);
			
		}
		
		
		//Switch case 문 실행해보기 
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("숫자 작성 : ");
		int 날짜 = sc.nextInt();
		String 할일;
		switch(날짜) {
		case 1: 
			할일 = "월요일 : 업무";
			break;
		case 2: 
			할일 = "화요일 : 공부";
			break;
		default : 
			할일= "날짜와 관계없이 휴식";
			break;
		}
		System.out.println("일정 : "+할일);
	}*/
	}
}
