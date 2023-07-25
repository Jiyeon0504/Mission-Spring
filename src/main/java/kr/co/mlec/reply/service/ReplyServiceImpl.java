package kr.co.mlec.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.reply.dao.ReplyDAO;
import kr.co.mlec.reply.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDAO replyDao;
	
	@Override
	public void addReply(ReplyVO reply) {

		replyDao.insertReply(reply);
	}

	@Override
	public List<ReplyVO> getReplyList(int boardNo) {
		
		
		return replyDao.selectAllReply(boardNo);
	}

}
