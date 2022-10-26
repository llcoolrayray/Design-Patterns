package com.galaxy.example.designpatterns.bridge;

import com.galaxy.example.designpatterns.bridge.abstractive.AbstractMessage;
import com.galaxy.example.designpatterns.bridge.abstractive.NormalMessage;
import com.galaxy.example.designpatterns.bridge.abstractive.UrgentMessage;
import com.galaxy.example.designpatterns.bridge.implementor.EmailMessageImplementor;
import com.galaxy.example.designpatterns.bridge.implementor.MessageImplementor;
import com.galaxy.example.designpatterns.bridge.implementor.PhoneMessageImplementor;

public class Client {
    public static void main(String[] args) {
        MessageImplementor emailMessageImplementor = new EmailMessageImplementor();
        MessageImplementor phoneMessageImplementor = new PhoneMessageImplementor();

        AbstractMessage abstractMessage1 = new NormalMessage(emailMessageImplementor);
        AbstractMessage abstractMessage2 = new NormalMessage(phoneMessageImplementor);

        AbstractMessage abstractMessage3 = new UrgentMessage(emailMessageImplementor);
        AbstractMessage abstractMessage4 = new UrgentMessage(phoneMessageImplementor);

        String message = "交易终止";
        abstractMessage1.sendMessage(message);
        abstractMessage2.sendMessage(message);
        abstractMessage3.sendMessage(message);
        abstractMessage4.sendMessage(message);
    }
}
