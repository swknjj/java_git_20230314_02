package ex;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기존 배웠던 list는 index라는게 쌓이는 형식이었으나
		// map은 key를 찾아서 모든타입이 올수있다
		// map, Integer  정리할것
		
		Map<Integer, String> map1 = new HashMap<>();
		//map이라는 인터페이스 타입 , hash map이라는 클래스 객체를 선언
		// Integer = key를 위한 타입
		List<String> list1 = new ArrayList<>();
		
		 map1.put(1, "안녕하세요");
		 map1.put(2 ,"감사해요");
		 map1.put(3, "잘있어요");
		 map1.put(4, "다시만나요");
		 
		 //get 메소드의 리턴타입이 String이기 때문에
		String val1 = map1.get(1);
		System.out.println(val1);
		System.out.println(map1.get(1));
		
		for(int key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}

		
		}
	}


