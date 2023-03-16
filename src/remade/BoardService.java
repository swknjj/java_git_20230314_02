package remade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardService {

	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.println("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.println("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();

		boolean success = br.save(boardDTO, boardDTO.getBno());
		if (success = true) {
			System.out.println("게시글 등록완료!");
		} else {
			System.out.println("게시글 등록실패");
		}

	}

	public void findAll() {
		Map<String, BoardDTO> boardMap = br.findAll();
		// List<String> keySet = new ArrayList<>(boardMap.keySet());
		// Collections.sort(keySet);// Key 값 기준 오름차순
		// Collections.sort(keySet,Collections.reverseOrder());//Key 값 기준 내림차순
		ArrayList<String> keySet = new ArrayList<>(boardMap.keySet());
		keySet.sort(Comparator.naturalOrder());
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("----------------------------------------------------------");
		for (String key : keySet) {
			boardMap.get(key).print();
		}
	}

	public void findById() {
		System.out.println("읽을 번호> ");
		String bno = sc.next();
		BoardDTO boardDTO = br.findById(bno);
		if (boardDTO == null) {
			System.out.println("찾을수없는 글입니다");
		} else {
			boardDTO.increaseCnt();
			System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
			System.out.println("----------------------------------------------------------");
			boardDTO.print();
		}

	}

	public void update() {

		System.out.println("수정할 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		BoardDTO b = br.findById(bno);

		if (b == null) {
			System.out.println("조회할 수 없는 글번호입니다");
		} else {

			BoardDTO boardDTO = new BoardDTO();
			System.out.println("수정할 제목> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.println("수정할 작성자> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if (br.update(boardDTO, bno)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}

	public void delete() {
		System.out.println("삭제할 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		BoardDTO b = br.findById(bno);
		if (b == null) {
			System.out.println("조회할 수 없는 글번호입니다");
		} else {
			BoardDTO boardDTO = new BoardDTO();
			if (br.delete(boardDTO, bno)) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}

	}

	public boolean duCheck() { // 중복번호체크
		System.out.println("확인할 글번호 입력");
		String name = sc.next();
		if (br.findById2(name)) {
			System.out.println("중복된 번호가 있습니다");
			return false;
		} else {
			System.out.println("생성 가능한 글번호입니다");
			return true;
		}
	}
/*
	public void test() {
		for(int i=1; i<6; i++) {
			
		}
		BoardDTO boardDTO1 = new BoardDTO("1111", "1111");
		BoardDTO boardDTO2 = new BoardDTO("2222", "2222");
		BoardDTO boardDTO3 = new BoardDTO("3333", "3333");
		BoardDTO boardDTO4 = new BoardDTO("4444", "4444");
		BoardDTO boardDTO5 = new BoardDTO("5555", "5555");
		br.save(boardDTO1, boardDTO1.getBno());
		br.save(boardDTO2, boardDTO2.getBno());
		br.save(boardDTO3, boardDTO3.getBno());
		br.save(boardDTO4, boardDTO4.getBno());
		br.save(boardDTO5, boardDTO5.getBno());
		System.out.println("테스트데이터 삽입완료");
	}
*/
	public void test() {
		for (int i = 1; i <= 5; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("writer" + i);
			br.save(boardDTO,boardDTO.getBno());
		}
	}
	/*
	public void search() {
		System.out.print("검색할 작성자 입력> ");
		String searchWriter = sc.next();sc.nextLine();//검색할 작성자 입력받기
		Map<String, BoardDTO> boardMap = br.search(searchWriter);//search메소드를 이용해 리스트받아오기
		if (boardMap == null) {
			System.out.println("검색되는 작성자가 없습니다");
		} else {
			ArrayList<String> keySet = new ArrayList<>(boardMap.keySet());
			keySet.sort(Comparator.naturalOrder());
			System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		
			System.out.println("----------------------------------------------------------");
			for (String key : keySet) {
				if(boardMap.get(key).getWriter().equals(searchWriter)){
				boardMap.get(key).print();
				}
			}
				
		}
	}
*/
	public void search() {
		System.out.print("검색할 작성자 입력> ");
		String searchWriter = sc.next();sc.nextLine();
		
		List<BoardDTO> boardDTO = br.search(searchWriter);
		if(boardDTO.size() == 0) {
			System.out.println("검색된 작성자가 없습니다");
		}
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		for(BoardDTO b : boardDTO) {
			b.print();
			
		}
		
	}

}



