package com.by.spring.anot.resource;

import jakarta.annotation.Resource;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@NoArgsConstructor
public class MonitorViewer {

    private Recorder recorder;      // has-a 관계

    @Resource()   // == @Autowired / 빈을 이름을 기준으로 연결해줌
    public void setRecorder(@Qualifier("y") Recorder recorder){
        this.recorder = recorder;

        boolean record = Resource.class.getTypeName().contains("record1");
        System.out.println(record);

        System.out.println(Resource.AuthenticationType.class);

        recorder.show();
        System.out.println(recorder);
        System.out.println("@Resource 주입");
    }

    public void print() {
        recorder.show();
    }

}
