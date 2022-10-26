package com.galaxy.example.designpatterns.bridge.abstractive;

import com.galaxy.example.designpatterns.bridge.implementor.MessageImplementor;

public class UrgentMessage extends AbstractMessage{
    public UrgentMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("发送紧急消息");
        messageImplementor.sendMessage(message);
        System.out.println("-------------------------");
    }
}
