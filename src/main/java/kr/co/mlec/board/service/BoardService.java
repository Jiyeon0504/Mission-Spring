package kr.co.mlec.board.service;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/**
	주문현황
	상품테이블, 회원테이블
	
 */

public interface BoardService {

	public List<BoardVO> getBoardList();

	

	 public BoardVO getBoardByNo(int no);
	 
	 void addBoard(BoardVO board);
	
	
}
