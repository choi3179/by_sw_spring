package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // (하나의 질문에 여러 개의 답변이 달릴 수 있다.)
    // Answer 객체의 "question" 필드와 매핑 + @ManyToOne 과 매핑
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    // SiteUser 테이블 참조(Fk) -> SiteUser의 @id 와 매핑
    @ManyToOne
    private SiteUser author;
    
    private LocalDateTime modifyDate;
    
    @ManyToMany
    Set<SiteUser> voter;
}