package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PizzaShop {
	public static void main(String[] args) {
		//주문 목록을 저장할 ArrayList
		ArrayList<pizzaOrder> 주문리스트=new ArrayList<>();
		
		ArrayList<String> 고객리스트 =new ArrayList<>(Arrays.asList("고영희", "박철진", "안영식","고영희","박철진"));
		ArrayList<String> 피자리스트 =new ArrayList<>(Arrays.asList("페페로니", "마르게리따", "슈프림","파인애플","치즈"));
		
		//for문을 활용해서 주문 추가
		for(int i=0; i<고객리스트.size(); i++) {
			pizzaOrder 오더=new pizzaOrder(고객리스트.get(i),피자리스트.get(i));
			주문리스트.add(오더);
		}
		
		System.out.println(고객리스트);
		System.out.println(피자리스트);
		System.out.println(주문리스트);
			
		
		//HashSet 사용해서 중복 주문을 방지하기 위한 set
		HashSet<String> 고객명1 = new HashSet<>();
		고객명1.add("고영희");
		고객명1.add("박철진");
		고객명1.add("안영식");
		고객명1.add("고영희");
		고객명1.add("박철진");
		HashSet<String> 피자타입1 = new HashSet<>();
		피자타입1.add("페페로니");
		피자타입1.add("마르게리따");
		피자타입1.add("슈프림");
		피자타입1.add("파인애플");
		피자타입1.add("치즈");
		 
		
		//주문추가 PizzaOrder를 사용해서 주문을 추가함 
		pizzaOrder 고객1 =new pizzaOrder("1","2");
		//주문한 내용 전체보기 toString
		고객1.toString();
		
		//중복된 주문 정보 제거한거 출력
		
	}
 
			
	
	
	
	 

}
