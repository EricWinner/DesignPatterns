package com.design.pattern.factory;

public class ConcreateLocation extends SimpleLocationFactory {

    /**
     * 根据不同的类型生成不同的Location
     */
    @Override
    public Location createLocation(String type) {
        if (type.equalsIgnoreCase("random")) {
            return new RandomLocation();
        } else if (type.equalsIgnoreCase("traverse")) {
            return new TraverseLocation();
        }
        return null;
    }

}
