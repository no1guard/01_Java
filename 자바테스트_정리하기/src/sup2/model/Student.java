package sup2.model;
/*
학생의 이름 학년 반 번호 성별 성적을 키보드로 입력받아 출력한다
단 성별이 m이면 남학생 M이 아니면 여학생으로 ㄴ상한연산자를 출력한다 
*/
public class Student {
	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	int 성적;
	
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, int 성적) {
	
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void 결과() {
		String 성별1=성별=='M' ? "남자" : "여자";
		System.out.println("이름 :"+이름);
		System.out.println("학년 : "+학년);
		System.out.println("반 : "+반);
		System.out.println("번호 : "+번호);
		System.out.println("성별 : "+성별1);
		System.out.println("성적"+ 성적 );
		
	}
	
	
	
	 
	 
}
