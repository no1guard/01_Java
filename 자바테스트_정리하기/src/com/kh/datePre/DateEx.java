package com.kh.datePre;
import java.text.ParseException;
/*
 	년도  월 일  시간 분    초  요일
 	yyyy-MM-dd HH: mm : ss eeee
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		//Date로 현재 날짜를 받아서 년-월-일 출력하기
		Date now=new Date();
		System.out.println(now);
		//Date는 최초1회만 호출 Date now=new Date();
		
		//년 월ㅇ일 
	/*	SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
		String na1=sdf1.format(now);
		System.out.println("년 월 일 : "+na1);
		*/
	 
		//시: 분: 초
		SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
		String na2=sdf2.format(now);
		System.out.println("시 분 초 :"+na2);
		
		//문자열 -> 날짜로 변경 
		try {
			Date parseDate2 =sdf2.parse(na2);
			System.out.println(parseDate2);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*//년-월일 시 분 초 
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String na3=sdf3.format(now);
		System.out.println("년 월 일 시 분 초 : " +na3);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatSdf2=sdf4.format(now);
		System.out.println(formatSdf2);
		
		
		//문자열(SimpleDateFormat - String)을 날짜(Date)로 변경 
		String 문자열= "2024-04-30 15:30:45";
		
		//SimpleDateForma sdf
		
		try {
			Date parseDate=sdf1.parse(문자열);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
}
