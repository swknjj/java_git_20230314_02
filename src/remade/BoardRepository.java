package remade;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BoardRepository {
//BoardRepository:데이터를 DB에 저장하는 역할 

	private Map<String,BoardDTO> boardMap = new HashMap<>();




	public boolean save(BoardDTO boardDTO,String bno) {
		boardMap.put(bno, boardDTO);
		return true;


	}

	public Map<String,BoardDTO> findAll() {
		
		return boardMap;

	}

	public BoardDTO findById(String bno) {
		for (String key:boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				BoardDTO boardDTO =  boardMap.get(key);
				return boardDTO;
			}
		}
		return null;
	}

	public boolean update(BoardDTO boardDTO, String bno) {

		for (String key:boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				boardMap.get(key).setTitle(boardDTO.getTitle());
				boardMap.get(key).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false; 
	}

	
	public boolean delete (BoardDTO BoardDTO, String bno) {

		for (String key:boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				boardMap.remove(key);
				return true;
			}
		}
		return false;
	}
	

}

	
	
	




