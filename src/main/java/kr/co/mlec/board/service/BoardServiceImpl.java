package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;


	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> list 
		= boardDao.selectAllBoard();
	
	return list;
	}


	@Override
	public BoardVO getBoardByNo(int no) {
		
		BoardVO board=boardDao.selectBoardByNo(no);
		
		return board;
	}


	@Override
	public void addBoard(BoardVO board) {

		
		      boardDao.insertBoard(board);
		      
		   }
		
	}


	




