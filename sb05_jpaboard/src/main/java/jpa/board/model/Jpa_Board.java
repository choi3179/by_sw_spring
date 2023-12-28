package jpa.board.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "JPA_BOARD")      // 클래스 명이 테이블 명이 됨. -> JPA에서 자동으로 테이블을 생성함.
public class Jpa_Board {  // Model

    @Id     // 유일성을 가지는 필드에 붙여주는 애노테이션 -> PRIMARY KEY 역할을 하게 됨.
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // mysql, mariadb 에서 Auto_increment 역할을 함
    @Column(length = 10)
    private int id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String passwd;

    @Column(length = 500, nullable = false)
    protected String title;

    @Column(length = 4000, nullable = false)
    protected String content;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date regdate;       // 작성 날짜

    @Column(length = 10, nullable = false)
    protected int readcount;      // 조회 수

    @Column(length = 10, nullable = false)
    protected int reply;          // 답글

    @Column(length = 10, nullable = false)
    protected int replystep;      //

    @Column(length = 10, nullable = false)
    protected int replylevel;     // 답글 단계(답글의 답글....)
}



