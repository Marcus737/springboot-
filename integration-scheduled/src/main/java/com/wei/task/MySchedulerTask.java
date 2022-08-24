package com.wei.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class MySchedulerTask {

    @Scheduled(fixedRate = 2000)
    public void ra(){
        System.out.println("ra:每两秒执行一次");
    }

    @Scheduled(cron = "* * * * * ?")
    public void rb(){
        System.out.println("rb:每一秒执行一次");
    }
}
