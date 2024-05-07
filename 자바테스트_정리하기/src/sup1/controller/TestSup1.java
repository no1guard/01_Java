package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int 총점 = 0;
		 int 평균 = 0;
		System.out.print("국어점수를 입력해주세요 : ");
		int 국어=sc.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int 영어=sc.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		int 수학=sc.nextInt();
		Score 학생1 =new Score(국어,영어,수학,총점,평균);

		학생1.결과();
		
}
	 
	 

}
