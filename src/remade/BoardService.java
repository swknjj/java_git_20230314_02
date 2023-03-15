package remade;

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

		boolean success = br.save(boardDTO,boardDTO.getBno());
		if (success = true) {
			System.out.println("게시글 등록완료!");
		} else {
			System.out.println("게시글 등록실패");
		}

	}


	public void findAll() {
		Map<String,BoardDTO> boardMap = br.findAll();

		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("----------------------------------------------------------");

		for (String key:boardMap.keySet()) {
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
		String bno = sc.next();sc.nextLine();
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
			if(br.update(boardDTO, bno)) {
			System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}
	}
	
	public void delete() {
		System.out.println("삭제할 글번호> ");
		String bno = sc.next();sc.nextLine();
		BoardDTO b = br.findById(bno);
		if( b == null) {
			System.out.println("조회할 수 없는 글번호입니다");
		}else {
			BoardDTO boardDTO = new BoardDTO();	
			if(br.delete(boardDTO, bno)) {
			System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}
		
	}

	
	
	
}
