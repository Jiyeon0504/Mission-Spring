package kr.co.mlec;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/spring-mvc.xml" })
public class DBTest {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionTemplate session;

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private BoardService boardService;

	@Ignore
	@Test
	public void dataSource테스트() throws Exception {
		assertNotNull(ds); // ds값이 널 아니지? 의존주입 잘 됐지?
		System.out.println(ds);
	}

	@Ignore
	@Test
	public void sqlSession테스트() throws Exception {
		assertNotNull(session);
	}

	@Ignore
	@Test
	public void 전체게시글조회테스트() throws Exception {
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectAllBoard");

		for (BoardVO board : list) {
			System.out.println(board);
		}

	}

	
	@Ignore
	@Test
	public void 전체게시글조회BoardDAO테스트() throws Exception {
		List<BoardVO> list = boardDAO.selectAllBoard();

		for (BoardVO b : list) {
			System.out.println(b);
		}

	}

	@Ignore
	@Test
	public void 전체게시글조회Service테스트() throws Exception {
		List<BoardVO> list = boardService.getBoardList();

		for (BoardVO b : list) {
			System.out.println(b);
		}

	}
	
	@Test
	public void 상세게시글조회테스트() throws Exception {
		BoardVO board = session.selectOne("board.dao.BoardDAO.selectBoardByNo",21);
				System.out.println(board);
	}
	
	

}
