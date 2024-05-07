package com.kh.goodShop;

import java.util.*;
public class 컴퓨터가게 {
	public static void main(String[] args) {
		
		//모든제품 HashMap
		HashMap<String,Integer> 모든제품= new HashMap<>();
		
		모든제품.put("노트북",700000 );
		모든제품.put("데스트탑",20000 );
		모든제품.put("모니터",5000 );
		모든제품.put("마우스",3000 );
		모든제품.put("키보드",2000 );
		System.out.println("컴퓨터 상품 목록");
		for(Map.Entry<String, Integer> 아이템  : 모든제품.entrySet()) {
			String 상품명 =아이템.getKey();
			int 가격 = 아이템.getValue();
			System.out.println("상품명 : "+상품명+", 가격 :"+가격);
		}
		
		//특정 물품의 가격 출력
		String 찾는물건="USB";
		System.out.println(찾는물건+"가게에 있습니까");
		
		//containskey 존재하지않는지
		if(모든제품.containsKey(찾는물건)) {
			System.out.println("네 존재합니다");
		}else {System.out.println("품절입니다.");
		
		}
		
		
		
	}

}
