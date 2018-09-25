package com.design.pattern.proxy;

public class RobotAControl implements IRobotAControl {

    private RobotAChassis robotAChassis;

    public RobotAControl() {
        robotAChassis = RobotAChassis.getInstance();
    }

    @Override
    public void connect(String ip, String port) {
        robotAChassis.connect(ip, port);
    }

    @Override
    public void connect(String ip) {
        robotAChassis.connect(ip);
    }

    @Override
    public void setSpeed(String speed) {
        robotAChassis.setSpeed(speed);
    }

    @Override
    public void pauseTask() {
        robotAChassis.pauseTask();
    }

}
