package jpa.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import jpa.board.model.Jpa_Board;
import jpa.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	//-----------------------------------------
	// 게시판 리스트 보기, 한페이지에 5개씩
	// curPage:요청하는 페이지, 첫페이지는 0
	//-----------------------------------------
	public Page<Jpa_Board> findAll(Integer curPage) {
		/*PageRequest pr = new PageRequest(curPage, 5,
				                    new Sort(
				                    		new Order(Direction.DESC, "reply"),
				                    		new Order(Direction.ASC, "replystep")));*/
		PageRequest pr = PageRequest.of(curPage, 5, Sort.by(Sort.Direction.DESC, "reply").
				and(Sort.by(Direction.ASC, "replystep")));
		return boardRepository.findAll(pr);
	}

}
