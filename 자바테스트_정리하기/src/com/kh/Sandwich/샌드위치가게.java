package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {
public static void main(String[] args) {
	//주문리스트 ArrayList
	ArrayList<샌드위치> 주문리스트 = new ArrayList<>();
	주문리스트.add(new 샌드위치("김하나","BLT"));
	주문리스트.add(new 샌드위치("이둘","터키"));
	주문리스트.add(new 샌드위치("김하나","치킨"));
	주문리스트.add(new 샌드위치("이셋","에그마요"));
	주문리스트.add(new 샌드위치("김하나","베지터블"));

	
	//고객명 HashSet
	
	HashSet<String> 중복고객제거=new HashSet<>();//중복제거용 해쉬셋 

	//중복제거리스트 ArrayList
	
	List<샌드위치> 중복제거주문 =new ArrayList<>();
	
	//중복 여부를 확인하고 중복되지않은 주문만 리스트에 추가 
	
	for(샌드위치 새주문 : 주문리스트) {
		if(!중복고객제거.contains(새주문.get고객명())) {
			중복제거주문.add(새주문);//
			중복고객제거.add(새주문.get고객명());  
			
		}
	}
	
	
	for(샌드위치 칵 : 중복제거주문) {
		System.out.println(칵);
	}
}

}
