package com.design.pattern.factory;

public class ReflectConcreate extends ReflectLocationFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Location> T createLocation(Class<T> clz) {
        Location location = null;
        try {
            location = (Location) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("createLocation exception = " + e);
        }
        return (T) location;
    }
}