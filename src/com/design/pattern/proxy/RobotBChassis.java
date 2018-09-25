package com.design.pattern.proxy;

import java.util.ArrayList;

public class RobotBChassis {

    private static RobotBChassis instance;

    private RobotBChassis() {
    }

    public static RobotBChassis getInstance() {
        if (instance == null) {
            synchronized (RobotBChassis.class) {
                if (instance == null) {
                    instance = new RobotBChassis();
                }
            }
        }
        return instance;
    }

    public void connect(String ip, String port) {
        System.out.println("RobotBChassis connect ip = " + ip + ",port = " + port);
    }

    public void connect(String ip) {
        System.out.println("RobotBChassis connect ip = " + ip);
    }

    public void setSpeed(String speed) {
        System.out.println("RobotBChassis setSpeed ");
    }

    public void startTask() {
        System.out.println("RobotBChassis startTask ");
    }

    public void uploadMap(String filePath, String fileName) {
        System.out.println("RobotBChassis uploadMap filePath = " + filePath + ",fileName = " + fileName);
    }

    public void startPatrol(ArrayList<?> arrayList) {
        System.out.println("RobotBChassis startPatrol arrayList.size = " + arrayList.size());
    }
}
