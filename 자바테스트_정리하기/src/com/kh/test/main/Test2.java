package com.kh.test.main;

public class Test2 {
	/*2단에서 5단까지의 구구단의 결과 중 홀수 인것만 출력한다 . 단 , for문을 이용한다.*/
	public static void main(String[] args) {
		
		for(int 단= 2; 단<=5; 단++) {
		
			for(int 곱=1; 곱<9; 곱++) {
				 
				if(단%2==1) {
					int sum=단*곱;
					System.out.println(단+"X"+곱+"="+sum);
					}
				 
			}System.out.println(" ");
			
		}
	}
	 

}
