package sup1.model;

public class Score {
//필드 
	public int 국어;
	public int 영어;
	public int 수학;
	public int 총점;
	public double 평균;

//메서드
	public Score(int 국어, int 영어, int 수학, int 총점, double 평균) {
	
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
	}
	
	//void 
	public void 결과() {
		int 총점=국어+영어+수학;
		double 평균 =(double)총점/3.0;
		String 캭= (평균>=50&&국어>=50&&영어>=50&&수학>=50 ? "합격입니다." : "불합격입니다.");
		String 결과 = (국어>=50 && 수학>=50 && 영어>=50) ? "합격" : "불합격";
		System.out.println("국어점수 : "+국어);
		System.out.println("영어점수 : "+영어);
		System.out.println("수학점수 : "+수학);
		System.out.println(캭);
		//(평균>=50&&국어>=50&&영어>=50&&)수학>=50 ? "합격입니다." : "불합격입니다.");
		
	}

 
	
}
//평균 5-점 이상이면 합격
//삼항연산자로 합격 불합격
//각 점수가 50이상 평균 50점이상
//출력문으로 국엉여어 수학점


