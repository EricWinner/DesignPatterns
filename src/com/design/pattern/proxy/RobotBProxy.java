package com.design.pattern.proxy;

import java.util.ArrayList;

public class RobotBProxy implements IRobotBControl {

    private IRobotBControl iRobotBControl;

    public RobotBProxy(IRobotBControl iSouthRobotControl) {
        this.iRobotBControl = iSouthRobotControl;
    }

    @Override
    public void connect(String ip, String port) {
        iRobotBControl.connect(ip, port);
    }

    @Override
    public void connect(String ip) {
        iRobotBControl.connect(ip);
    }

    @Override
    public void setSpeed(String speed) {
        iRobotBControl.setSpeed(speed);
    }

    @Override
    public void startTask() {
        iRobotBControl.startTask();
    }

    @Override
    public void uploadMap(String filePath, String fileName) {
        iRobotBControl.uploadMap(filePath, fileName);
    }

    /**
     * startPatrol
     */
    @Override
    public void startPatrol(ArrayList<?> arrayList) {
        iRobotBControl.startPatrol(arrayList);
    }

}
