package com.kh.PropertiesPre;

import java.util.*;

public class UserSetting {
public static void main(String[] args) {
	//Properties 객체와 인스턴스 생성 = setting
	 Properties setting = new Properties();
	 
	 //속성 설정 
	 setting.setProperty("name", "john");
	 setting.setProperty("age", "17");
	 setting.setProperty("city", "seoul");
	 
	 //city조회하기
	 String 조회하기=setting.getProperty("city");//방법1
	 //조회내용 출력 
	 System.out.println(조회하기);
	 System.out.println(setting.getProperty("age"));//방법2
	 
	 
	 
	 //전체조회하기 
	 for(Map.Entry<Object, Object> 전체 : setting.entrySet()) {
		 Object 키값= 전체.getKey();
		 Object 벨류값=전체.getValue();
		 System.out.println("키값 : "+키값+"\n벨류값 :"+벨류값);
		 
	 }
}
}
