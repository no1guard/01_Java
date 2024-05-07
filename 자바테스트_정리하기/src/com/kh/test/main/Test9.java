package com.kh.test.main;

public class Test9 {
	public static void main(String[] args) {
		String [] 요일 = {"월","화","수"}; //자료형 [] 이름 = {값1,값2,값3};
		for(String 날짜 : 요일 ) { //for-each문 사용 
			System.out.println(날짜);
		}
		// length는 장바구니에 배열에 들어있는 개수 
		System.out.println(요일.length);
		// index로 각 자리에 어떤 값이 들어있는지 확인하고 싶다면 
		// 변수명[알고싶은숫자]
		System.out.println(요일[0]);
		
		//인덱스 이용해서 1번의 자리에 있는 값
		System.out.println(요일[0]);
		// 인덱스 이용해서 요일 2번의 자리에 있는 값
		System.out.println(요일[1]);
	}

}
