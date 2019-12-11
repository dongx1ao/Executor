package com.gupao.thread.executors;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;

@SpringBootTest
class ExecutorsApplicationTests {
    @Test
    public void testExecutors() throws InterruptedException {
        System.out.println("发送短信");
        saveSmsRecord();
        System.out.println("主方法返回");
    }




    @Async("asyncServiceExecutor")
    public void saveSmsRecord() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("记录短信流水");
    }

}
