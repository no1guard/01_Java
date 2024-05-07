package com.kh.serialEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		String 파일이름 ="Student.txt";
		Student 학생1 =new Student("22",30);
		
		try {
			FileOutputStream fos = new FileOutputStream(파일이름);
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			//객체를 직렬화해서 파일 작성하기
			oos.writeObject(학생1);
			oos.close();
			System.out.println("객체를 직렬화해서 파일에 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	 

}
