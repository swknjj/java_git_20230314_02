package ex;

import java.util.*;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Long, StudentDTO> studentMap = new HashMap<>(); // 학생정보를 관리할 Map
		StudentDTO s1 = new StudentDTO();
		s1.setId(1L);
		s1.setStudentNumber("1111");
		s1.setStudentName("김자바");
		s1.setStudentMajor("컴퓨터공학");
		s1.setStudentMoblie("010-1111-1111");
		studentMap.put(s1.getId(), s1);
		
		StudentDTO s2 = new StudentDTO();
		s2.setId(2L);
		s2.setStudentNumber("2222");
		s2.setStudentName("이자바");
		s2.setStudentMajor("경영학");
		s2.setStudentMoblie("010-2222-2222");
		studentMap.put(s2.getId(), s2);
		
		StudentDTO s3 = new StudentDTO();
		s3.setId(3L);
		s3.setStudentNumber("3333");
		s3.setStudentName("박자바");
		s3.setStudentMajor("전자공학");
		s3.setStudentMoblie("010-3333-3333");
		studentMap.put(s3.getId(), s3);
		
		//반복문으로 출력
		System.out.printf("번호(id)\t학번\t이름\t전공\t전화번호\n");
		System.out.println("================================================");
		for(Long key:studentMap.keySet()) {
			System.out.println(key+"\t"+studentMap.get(key).toString());
			
		}
		
		

		
	}

}
