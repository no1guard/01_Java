package ncs.test5;

public class BookArrayTe {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0]=new Book("자바의정석","남궁성",30000,"도우출판",0.1);
		bArray[1]=new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		bArray[2]=new Book("객체지향 JAVa8","금영욱",30000,"도우출판",0.1);
		
		for(Book A : bArray) {
		 System.out.println(A.getTitle()+" "+A.getAuthor()+" \n"+A.getPrice()+" "+A.getPublisher()+" ");
		 System.out.println("할인된 가격  :"+A.get할인가());
		}
	}
 
}
