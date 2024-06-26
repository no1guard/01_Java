package ncs.test4;
/*
 - name:String
- price:int
- quantity:int

+Product()
+Product(name:String,price:in
t, quantity:int)


+information():String // Product 객체의 이름, 가격,
개수를 String으로 리턴 한다.

+setXXX()
+getXXX()
 */
public class Product {
//필드	
	private String name;
	private int price;
	private int quantify;
	

	//기본생성자	
	public Product() {
	 
	}
//필수생성자
	public Product(String name, int price, int quantify) {
 
		this.name = name;
		this.price = price;
		this.quantify = quantify;
	}

	
//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantify(int quantify) {
		this.quantify = quantify;
	}
//getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantify() {
		return quantify;
	}
	
	//+information():String // Product 객체의 이름, 가격,
	//개수를 String으로 리턴 한다.
	
	public String information() {
		return "상품명 :"+name+"가격 :"+price+"갯수 :"+quantify+ 
				"\n총 가격:" + (getPrice()*quantify)+"원";
		
	}

}
