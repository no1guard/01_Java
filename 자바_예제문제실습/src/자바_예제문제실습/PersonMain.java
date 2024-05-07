package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void fileSave(String 파일이름) {
		File file=new File(파일이름);
		try {
			FileWriter fc=new FileWriter(file);
			//파일에 문자열을 작성하고 출력을 도와주는 버터드라이트
			BufferedWriter bw=new BufferedWriter(fc);
			
			Person 사람1=new Person("김영희",10);
			bw.write(사람1.toString());
			System.out.println("저장이 완료되었습니다.");
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
  public static void main(String[] args) {
	  PersonMain 파일만들기 =new PersonMain();
	  파일만들기.fileSave("Person.txt");
}
}
