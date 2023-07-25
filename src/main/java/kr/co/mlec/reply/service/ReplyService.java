package kr.co.mlec.reply.service;

import java.util.List;

import kr.co.mlec.reply.vo.ReplyVO;

public interface ReplyService {
	
	public void addReply(ReplyVO reply);
	public List<ReplyVO> getReplyList(int boardNo);
	
}
