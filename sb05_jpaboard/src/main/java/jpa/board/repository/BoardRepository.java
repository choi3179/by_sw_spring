package jpa.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.board.model.Jpa_Board;

/*
    - JpaRepository<T, Integer> : T에 테이블 객체가 들어감.
 */
public interface BoardRepository extends JpaRepository<Jpa_Board, Integer> {

}
