package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.WelcomeEntity;

public class WelcomePackageEvent extends ReceiveDataPackageEvent<WelcomeEntity> {
    public WelcomePackageEvent(Object source, WelcomeEntity entity) {
        super(source, entity);
    }
}
