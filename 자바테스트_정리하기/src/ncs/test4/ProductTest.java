package ncs.test4;
/*
 main 함수 안에서 Product
객체 초기값을 키보드로
입력받아 초기화 생성하고,
필드값을 초회해서 계산하고
출력한다.
 */

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("상품명을 입력하세요 :");
		String name=sc.nextLine();
		System.out.print("가격을 입력하세요 : ");
		int price=Integer.parseInt(sc.nextLine());
		System.out.print("갯수를 입력하세요 :");
		int quantify=sc.nextInt();
		
		Product dd =new Product(name,price,quantify);
		System.out.println(dd.information()); 
		
	}

}
