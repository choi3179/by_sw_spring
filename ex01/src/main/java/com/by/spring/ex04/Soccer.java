package com.by.spring.ex04;

import org.springframework.beans.factory.annotation.Autowired;

public class Soccer {

    @Autowired  // 자동 주입
    private PlayerImpl player;

    // Setter Method로 주입
    public void setPlayer(PlayerImpl player) {      // 외부에서 주입한 DI 사용하기
        this.player = player;
    }
}
