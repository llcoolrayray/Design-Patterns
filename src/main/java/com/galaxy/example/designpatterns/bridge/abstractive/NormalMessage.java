package com.galaxy.example.designpatterns.bridge.abstractive;

import com.galaxy.example.designpatterns.bridge.implementor.MessageImplementor;

public class NormalMessage extends AbstractMessage{
    public NormalMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("发送普通消息");
        messageImplementor.sendMessage(message);
        System.out.println("-------------------------");
    }
}
