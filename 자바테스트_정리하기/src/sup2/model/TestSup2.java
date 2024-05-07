package sup2.model;

import java.util.Scanner;

public class TestSup2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력해주세요 :");
		String 이름=sc.nextLine();
		System.out.print("학년을 입력해주세요 :");
		int 학년=sc.nextInt();
		System.out.print("반을 입력해주세요 :");
		int 반=sc.nextInt();
		System.out.print("번호를 입력해주세요 :");
		int 번호=sc.nextInt();
		System.out.print("성별을 입력해주세요 :"); //charAt
		char 성별=sc.next().charAt(0);
		System.out.print("성적을  입력해주세요 :");
		int 성적=sc.nextInt();
		
		Student 학생1= new Student(이름,학년,반,번호,성별,성적);
		
		학생1.결과();
	}

}
