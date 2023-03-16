package remade;

import java.util.*;

public class BoardRepository {
//BoardRepository:데이터를 DB에 저장하는 역할 

	private Map<String, BoardDTO> boardMap = new HashMap<>();

	public boolean save(BoardDTO boardDTO, String bno) {
		boardMap.put(bno, boardDTO);
		return true;

	}

	public Map<String, BoardDTO> findAll() {
		return boardMap;

	}

	public BoardDTO findById(String bno) {
		for (String key : boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				BoardDTO boardDTO = boardMap.get(key);
				return boardDTO;
			}
		}
		return null;
	}

	public boolean findById2(String bno) {
		if (boardMap.containsKey(bno)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean update(BoardDTO boardDTO, String bno) {

		for (String key : boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				boardMap.get(key).setTitle(boardDTO.getTitle());
				boardMap.get(key).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

	public boolean delete(BoardDTO BoardDTO, String bno) {

		for (String key : boardMap.keySet()) {
			if (boardMap.get(key).getBno().equals(bno)) {
				boardMap.remove(key);
				return true;
			}
		}
		return false;
	}
/*
	public Map<String, BoardDTO> search(String searchWriter) {
		for (String key : boardMap.keySet()) {
			if (boardMap.get(key).getWriter().equals(searchWriter)) {
				return boardMap;
			}
		}
		return null;
	}
*//*
	public List<BoardDTO> search(String searchWriter) {
		List<BoardDTO> List = new ArrayList<>();
		List<String> keySet = new ArrayList<>(boardMap.keySet());
		keySet.sort(Comparator.naturalOrder());
		for (String m : keySet) {
			if (m.ke {
				BoardDTO boardDTO = new BoardDTO();
				boardDTO = 
				List.add(boardDTO);
				
			}
		}
		return List;
	}
*/
	public List<BoardDTO> search(String searchWriter) {
		ArrayList<BoardDTO> List = new ArrayList<>();
		ArrayList<String> search = new ArrayList<>(boardMap.keySet());
		search.sort(Comparator.naturalOrder());
		for (String m : search) {
			if (boardMap.get(m).getWriter().equals(searchWriter)) {
				BoardDTO boardDTO = new BoardDTO();
				boardDTO = boardMap.get(m);
				List.add(boardDTO);
			}
		}
		return List;
	}
}
