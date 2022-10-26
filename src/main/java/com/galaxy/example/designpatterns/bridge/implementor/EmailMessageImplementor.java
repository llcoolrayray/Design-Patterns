package com.galaxy.example.designpatterns.bridge.implementor;

public class EmailMessageImplementor implements MessageImplementor{
    @Override
    public void sendMessage(String message) {
        System.out.println("发送邮件："+message);
    }
}
