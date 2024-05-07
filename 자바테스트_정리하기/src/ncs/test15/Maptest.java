package ncs.test15;

import java.util.*;

public class Maptest {
	public static void main(String[] args) {
		Map<String,Inventory> inventoryMap=new HashMap<>();
		
		//상품 정보 String으로 어떤 핸드폰인지 작성 Inventory 핸드폰 정보 넣기 
		//상품 정보 등록 
		Calendar 캘린더 = Calendar.getInstance();
		캘린더.set(2016,캘린더.MARCH, 15);
		
		캘린더.set(2016,캘린더.FEBRUARY,15); //제품별 날짜를 다르게 설정해서 넣어줌 
		inventoryMap.put("삼성 갤럭시S7", new Inventory("삼성갤럭시s7",캘린더.getTime(),30));
 
		캘린더.set(2016,캘린더.FEBRUARY,25);
		inventoryMap.put("LG G5", new Inventory("LG G5",캘린더.getTime(),30));
		
		캘린더.set(2016,캘린더.FEBRUARY,23);
		inventoryMap.put("애플 아이패드 프로", new Inventory("애플 아이패드 프로",캘린더.getTime(),30));
		try {
		캘린더.set(2016,캘린더.APRIL,28);
		inventoryMap.get("삼성 갤럭시S7").setGetDate(캘린더.getTime()); // 출고 날짜 
		inventoryMap.get("삼성 갤럭시S7").setGetAmount(10); //출고 갯수 
		
		
		inventoryMap.get("LG G5").setGetDate(캘린더.getTime());
		inventoryMap.get("Lg G5").setGetAmount(10);
		 
		inventoryMap.get("애플 아이패드 프로").setGetDate(캘린더.getTime());
		inventoryMap.get("애플 아이패드 프로").setGetAmount(10);
		
		//만약에 제품이 존재하지 않을 경우 AmountNotEnough 넣고 사용 할 것 
		for(Inventory 인벤토리 :inventoryMap.values()) {
			if(인벤토리.getGetAmount()>인벤토리.getPutAmount()) {
				throw new AmountNotEnough("출고 수량을 넘었습니다.");
			}
		}
		
		}catch (AmountNotEnough e) {
			e.printStackTrace(); //에러를 출력해서 보여주기 
			
		}
		//for-each문을 활용해서 상품 정보 출력
		 
		}
		//현재는 팔린 제품이 없기 때문에 출고일도 출고 수량 남은 수량은 없음 
	}


