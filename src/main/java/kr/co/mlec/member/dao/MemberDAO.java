package kr.co.mlec.member.dao;

import kr.co.mlec.member.vo.MemberVO;
/*
 t_member(회원테이블)CRUD
 @author User
 */
public interface MemberDAO {

	MemberVO login(MemberVO member);
	
	/*
	 id,password 적합한 회원데이터 조회
	 @param member id와 password 가진 데이터
	 @return login 성공시 조회된 회원데이터
	 */
}
