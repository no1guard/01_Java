package com.kh.serialEx;

//학생을 직렬화하기
public class Student {
	private String name;


	private int age;
	
//메서드 
	//Getter
	
	//Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//필수생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	//기본생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}

	//To String

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
