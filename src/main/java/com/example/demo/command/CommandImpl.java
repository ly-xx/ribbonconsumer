package com.example.demo.command;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

//具体命令实现
public class CommandImpl implements Command {
    private Receiver receiver;

    public CommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        this.receiver.active();
    }
}
