package 자바_예제문제실습;
/*
  캡슐화
  String 사람이름 김영희 
  int 나이 10
  생성자 모두 만들기
  tostring 출력 
  
  
  PersonMain 만들고 peson.txt
 */
public class Person {
//필드	
	private String 사람이름;
	public String get사람이름() {
		return 사람이름;
	}
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}




	private int 나이;

//생성자 
public Person() {
}
//필수 생성자
public Person(String 사람이름, int 나이) {


	this.사람이름 = 사람이름;
	this.나이 = 나이;
}




@Override


public String toString() {
	return "사람이름=" + 사람이름 + ", 나이=" + 나이;
}



}
