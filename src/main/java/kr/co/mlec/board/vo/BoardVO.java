package kr.co.mlec.board.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class BoardVO {
	
	private int no;
	
	@Length(min=2, max=50, message="최소 2글자 이상 50글자 이하만 가능합니다")
//	@NotEmpty(message="필수항목입니다")
	private String title;
	
	@Pattern(regexp = "^[A-Za-z0-0]*$", message = "특수문자 사용 ㄴㄴ")
	@NotEmpty(message="필수항목입니다")
	private String writer;
	private String content;
	private int viewCnt;
	private String regDate;
	
	private int replyCnt;
	
	
	
	public int getReplyCnt() {
		return replyCnt;
	}


	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}


	public BoardVO() {
		super();
	}


	public BoardVO(int no, String title, String writer, String content, int viewCnt, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getViewCnt() {
		return viewCnt;
	}


	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", viewCnt="
				+ viewCnt + ", regDate=" + regDate + "]";
	}
	
	
	
}
