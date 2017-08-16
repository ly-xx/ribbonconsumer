package com.example.demo.command;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.active(); //客户端通过调用者来执行命令
    }
}
