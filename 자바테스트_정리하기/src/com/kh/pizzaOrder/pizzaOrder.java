package com.kh.pizzaOrder;

public class pizzaOrder {
//필드=전역변수 
	//각각의 멤버변수 
	private String 고객명;
	public String get고객명() {
		return 고객명;
	}
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}
	public String get피자타입() {
		return 피자타입;
	}
	public void set피자타입(String 피자타입) {
		this.피자타입 = 피자타입;
	}


	private String 피자타입;
//메서드
	//생성자 기본
	public pizzaOrder() {
		 
	}
	//생성자 필수
public pizzaOrder(String 고객명, String 피자타입) {
	this.고객명 = 고객명;
	this.피자타입 = 피자타입;
}
	
	
	@Override
	public String toString() {
		return "pizzaOrder [고객명=" + 고객명 + ", 피자타입=" + 피자타입  + "]";
	}
	
	
}
