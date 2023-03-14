package ex;

import java.util.*;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, StudentDTO> student = new HashMap<>();
		StudentDTO s1 = new StudentDTO();
		StudentDTO s2 = new StudentDTO();
		StudentDTO s3 = new StudentDTO();
		s1.setStudentNumber(1111);
		s1.setStudentName("김자바");
		s1.setStudentMajor("컴퓨터공학");
		s1.setStudentMoblie("010-1111-1111");
		student.put(1, s3);
		
		
		s2.setStudentNumber(2222);
		s2.setStudentName("이자바");
		s2.setStudentMajor("경영학");
		s2.setStudentMoblie("010-2222-2222");
		student.put(2, s1);
		
		
		s3.setStudentNumber(3333);
		s3.setStudentName("박자바");
		s3.setStudentMajor("전자공학");
		s3.setStudentMoblie("010-3333-3333");
		student.put(3, s2);
		
	
		System.out.printf("번호(id)\t학번\t이름\t전공\t전화번호\n");
		System.out.println("================================================");
		for(int key:student.keySet()) {
			System.out.println(key+"\t"+student.get(key).toString());
			
		}
		
		

		
	}

}
