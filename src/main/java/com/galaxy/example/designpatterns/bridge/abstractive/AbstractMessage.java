package com.galaxy.example.designpatterns.bridge.abstractive;

import com.galaxy.example.designpatterns.bridge.implementor.MessageImplementor;

public abstract class AbstractMessage {
    public MessageImplementor messageImplementor;

    public AbstractMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    public abstract void sendMessage(String message);
}
