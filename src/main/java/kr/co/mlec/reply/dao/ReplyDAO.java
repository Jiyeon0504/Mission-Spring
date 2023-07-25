package kr.co.mlec.reply.dao;

import java.util.List;

import kr.co.mlec.reply.vo.ReplyVO;

public interface ReplyDAO {
	/*
	 댓글등록
	 @param reply
	 */

	void insertReply(ReplyVO reply);
	
	/*
	 해당 게시물의 댓글리스트 조회
	 @param boardNo 게시글번호
	 @return 조회된 댓글리스트
	 */
	List<ReplyVO> selectAllReply(int boardNo);
}
