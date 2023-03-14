package ex;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("구구단 출력");
		for(int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
			
		}

		}
	}


