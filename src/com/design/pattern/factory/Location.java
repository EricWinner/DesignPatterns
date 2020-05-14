package com.design.pattern.factory;

import java.util.List;

public abstract class Location {

    /**
     * 生成坐标点
     * @return
     */
    abstract List<LocationInfo> generateLocation();
}
