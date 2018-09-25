package com.design.pattern.proxy;

public class RobotAProxy implements IRobotAControl {

    private IRobotAControl iRobotAControl;

    public RobotAProxy(IRobotAControl iRobotControl) {
        this.iRobotAControl = iRobotControl;
    }

    @Override
    public void connect(String ip, String port) {
        iRobotAControl.connect(ip, port);
    }

    @Override
    public void connect(String ip) {
        iRobotAControl.connect(ip);
    }

    @Override
    public void setSpeed(String speed) {
        iRobotAControl.setSpeed(speed);
    }

    @Override
    public void pauseTask() {
        iRobotAControl.pauseTask();
    }

}
