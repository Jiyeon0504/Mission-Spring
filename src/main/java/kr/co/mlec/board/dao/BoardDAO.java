package kr.co.mlec.board.dao;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/**
 * Database에서 게시판과 관련된 CRUD 표준 인터페이스
 * @author User
 */

public interface BoardDAO {

	   /**
	    * 전체게시글 조회
	    * @return 조회된 게시글
	    */
	   List<BoardVO> selectAllBoard();

	   BoardVO selectBoardByNo(int no);
	   
	   void insertBoard (BoardVO board);
	   
	   
	}

