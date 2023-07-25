package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.member.vo.MemberVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board")

	// request공유영역 얻어오기
	public String list(HttpServletRequest request) {

		List<BoardVO> boardList = boardService.getBoardList();

		// 공유영역 등록
		request.setAttribute("boardList", boardList);

		return "board/list2";
	}

	@GetMapping("/board/detail")
//	public String detail(@RequestParam("no") int no, @RequestParam("title") String data) {
	public String detail(HttpServletRequest request, @RequestParam("no") int no) {

		System.out.println("no:" + no);

		// no번에 해당 게시글 조회
		boardService.getBoardByNo(no);

		BoardVO board = boardService.getBoardByNo(no);
		// 공유영역에 등록
		request.setAttribute("board", board);

		return "board/detail";
	}

//	@GetMapping("/board/{no}")
//	public String detail1(@PathVariable("no") int boardNo, HttpServletRequest request) {
//		
//		System.out.println("boardNo : " + boardNo);
//		// no번에 해당 게시글 조회
//		BoardVO board = boardService.getBoardByNo(boardNo);
//
//		// 공유영역 등록
//		request.setAttribute("board", board);
//
//		return "board/detail";
//	}

	@GetMapping("/board/{no}")
	public ModelAndView detail2(@PathVariable("no") int boardNo, HttpServletRequest request) {

		System.out.println("boardNo : " + boardNo);
		// no번에 해당 게시글 조회
		BoardVO board = boardService.getBoardByNo(boardNo);

		ModelAndView mav = new ModelAndView();
		// 포워드시키려는 주소
		mav.setViewName("board/detail");
		// 공유영역 등록시키려는 애
		mav.addObject("board", board);

		// 공유영역 등록 , 위에서 해줘서 필요 없어짐
//		request.setAttribute("board", board);

		return mav;
	}

	@GetMapping("/board/write")
	public void writeForm(Model model, HttpSession session) {
		BoardVO board = new BoardVO(); // 비어있는 vo객체 하나 만들기
		
		MemberVO userVO = (MemberVO)session.getAttribute("userVO");
		if(userVO!=null) {
			board.setWriter(userVO.getId());
		}
			
			
			
		model.addAttribute("boardVO", board);

	}

	@PostMapping("/board/write")

	// 수십개를 다 넣을 수 없으니까 밑에 처럼 안쓰고 밑밑에 처럼 사용
//	public String write(@RequestParam("title") String title, @RequestParam("writer")String writer, @RequestParam("content") String content) {
	public String write(@Valid BoardVO board, BindingResult result) {

		System.out.println(result);
		/*
		if (board.getTitle() == null || board.getTitle().length() == 0) {
			System.out.println("에러발생");
			return "board/write";
		}
		*/
		
		
		if(result.hasErrors()) {
			System.out.println("에러발생");
			return "board/write";
			
		}

		boardService.addBoard(board);
		return "redirect:/board";
				
	}
	
	
	

}