package com.kh.reqularEx;
/*
 정규식(Reqular Expression)
  	문자열에서 특정한 규칙이나 패턴을 찾거나 검색할 때 유용하게 사용하기 위한 표현 방법 
  	
  	1. 문자
  	[abc] : a,b,c 중 하나와 일치하면 됨 
  	[^abc] : a,b,c 이외의 문자와 일치하면 됨
  	[a-z] : 소문자a부터 z까지 문자와 일치하는지 확인 
  	[A-Z] : 대문자 A부터 Z까지 문자와 일치하는지 확인
  	[0-9] : 숫자 0-9 문자와 일치하는지 확인 
    [가-힣]  : 한글 가-힣 모든 한글 문자가 일치하는지 확인 
    [ㄱ-ㅎ] : 자음 ㄱ-ㅎ 모든 자음이 일치하는지 확인
    [ㅏ-ㅣ] : 모음 ㅏ-ㅣ 모든 모음이 일치하는지 확인 
  	
  	2. 지정자
  	 		* : 0개 이상 문자와 일치
  	 		+ : 1개 이상 문자와 일치
  	 		? : 0또는 1개의 문자와 일치 
  	 	  {n} : 정확하게 n개의 문자와 일치 
  	 	 {n,} : 최소 n개 이상의 문자와 일치
  	 	 {n,m}: 최소 n개 이상 최대 m개의 문자와 일치 	
  	3. 특수문자 
  			. : 어떤 한 문자와 일치
  			^ : 문자열의 시작부분과 일치 
  			$ : 문자열의 끝부분과 일치 
  			\ : 특수문자를 사용할 것임 알려주는 것 
  				 특수문자를 사용하길 원한다면 \ 작성 후 뒤에 적어줘야함
  				 
  	정규식을 사용할 때 사용하는 방법은 여러가지 있음
  	Pattern.matches() 를 사용해서 전체문자열이 정규식과 일치하는지 여부를 확인하는데 사용
  	
  	문자열 안에서 특정 부분만 정규식과 일치하는지 확인하는 부분
  	Matcher.find() Matcher.matches()
  	String.split
 */

public class 정규식 {

}
