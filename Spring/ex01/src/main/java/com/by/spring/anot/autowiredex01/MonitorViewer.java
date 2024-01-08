package com.by.spring.anot.autowiredex01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {

    // 1. 필드에 적용
    @Autowired
    private Recorder recorder;      // has-a 관계

    // 2. setter method에 적용
    /*@Autowired
    public void setRecorder(Recorder recorder){
        this.recorder = recorder;
    }*/

    // 3. 일반 메소드 이용
    @Autowired
    public void userMethod(Recorder recorder){
        this.recorder = recorder;
        System.out.println("사용자 일반 메소드 주입");
    }

    // 4. 생성자 자동 주입
    @Autowired
    public MonitorViewer(Recorder recorder){
        this.recorder = recorder;
        System.out.println("생성자를 이용한 자동 주입");
    }

    public void print() {
        recorder.show();
    }

}
