package com.example.demo.command;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

// 接收者
public class Receiver {
    public void active() {
        //真正的业务逻辑
        System.out.println("测试命令模式");
    }
}
