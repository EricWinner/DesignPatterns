package com.design.pattern.proxy;

import java.util.ArrayList;

public class RobotBControl implements IRobotBControl {

    private RobotBChassis robotBChassis;

    public RobotBControl() {
        robotBChassis = RobotBChassis.getInstance();
    }

    @Override
    public void connect(String ip, String port) {
        robotBChassis.connect(ip, port);
    }

    @Override
    public void connect(String ip) {
        robotBChassis.connect(ip);
    }

    @Override
    public void setSpeed(String speed) {
        robotBChassis.setSpeed(speed);
    }

    @Override
    public void startTask() {
        robotBChassis.startTask();
    }

    @Override
    public void uploadMap(String filePath, String fileName) {
        robotBChassis.uploadMap(filePath, fileName);
    }

    @Override
    public void startPatrol(ArrayList<?> arrayList) {
        robotBChassis.startPatrol(arrayList);
    }

}
