package com.galaxy.example.designpatterns.bridge.implementor;

public class PhoneMessageImplementor implements MessageImplementor{
    @Override
    public void sendMessage(String message) {
        System.out.println("打电话："+message);
    }
}
