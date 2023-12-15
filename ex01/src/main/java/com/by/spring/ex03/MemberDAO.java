package com.by.spring.ex03;

public class MemberDAO {

    private MemberDTO dto;

    public MemberDAO() {}

    public MemberDAO(MemberDTO dto) {
        this.dto = dto;
    }

    public void setDto(MemberDTO dto) {
        this.dto = dto;
    }

    public void insert() {
        System.out.println(dto.getName() + " < " + dto.getAge() + " > ");
    }
}
