package com.by.spring.di.ex02;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor      // 디폴트 생성자
@AllArgsConstructor     // 모든 멤버 변수를 인자로 가지는 생성자
@RequiredArgsConstructor
public class IRecordImpl implements IRecord{    // DTO

    private int kor,eng,math,com;

    @Override
    public int total() {
        return this.kor + this.eng + this.com + this.math;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }
}
