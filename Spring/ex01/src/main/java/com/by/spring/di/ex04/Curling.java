package com.by.spring.di.ex04;

import org.springframework.beans.factory.annotation.Autowired;

public class Curling {

    @Autowired
    private PlayerImpl player;

    public void setPlayer(PlayerImpl player) {
        this.player = player;
    }
}
