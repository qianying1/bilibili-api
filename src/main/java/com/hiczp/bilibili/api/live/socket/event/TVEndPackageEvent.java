package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.TVEndEntity;

public class TVEndPackageEvent extends ReceiveDataPackageEvent<TVEndEntity> {
    public TVEndPackageEvent(Object source, TVEndEntity entity) {
        super(source, entity);
    }
}
