package com.example.demo.command;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

//客户端调用
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void active() {
        command.excute();
    }
}
