package com.kh.pizzaOrder;

import java.util.ArrayList;

public class PizzaShop2 {
	public static void main(String[] args) {
		 //주문목록을 저장할 ArrayList
		ArrayList<pizzaOrder> 주문리스트 = new ArrayList<>();
		
		//주문리스트.add(new PiazzaOrder("고영희","페페로니"));
		pizzaOrder 주문1 =new pizzaOrder("고영희","페페로니2");
		주문리스트.add(주문1);
// 		위에서 작성한 주문리스트와
//		밑에서 작성한 주문 리스트는
//		주문을 작성한 방식이 다를 뿐이지
//		동일하게 주문을 추가하는 방법
//		주문리스트.add(new pizzaOrder("고영희","페페로니"));
//
//
//
		
		
		//PizzaOrder 필수 생성자 이용해서 바로 입력 
		주문리스트.add(new pizzaOrder("고영희","페페로니"));
		주문리스트.add(new pizzaOrder("박철진","마르게리따"));
		주문리스트.add(new pizzaOrder("안영식","슈프림"));
		주문리스트.add(new pizzaOrder("고영희","파인애플"));
		주문리스트.add(new pizzaOrder("박철진","치즈"));
		
		//주문한 내용 전체보기 
		//toString 추가로 어떤 출력을 진행한다 하지 않아도 PizzaOrder에 작성한 자체가
		//정보를 정확하게 출력한다는 의미로 표기됨 
		System.out.println(주문리스트);
		
		//1개씩 보고 싶다면 for-each문 사용 
		for(pizzaOrder 주문 : 주문리스트) {
			System.out.println(주문);
		}
		
	}
 
			
	
	
	
	 

}
