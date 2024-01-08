package jpa.board.service;

import org.springframework.data.domain.Page;

import jpa.board.model.Jpa_Board;

public interface BoardService {
	//게시판 리스트 보기
	public Page<Jpa_Board> findAll(Integer curPage);
}
