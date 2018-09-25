package com.design.pattern.proxy;

/**
 * RobotA 执行类
 * @author EdwardAdmin
 *
 */
public class RobotAChassis {

    private static RobotAChassis instance;

    private RobotAChassis() {
    }

    public static RobotAChassis getInstance() {
        if (instance == null) {
            synchronized (RobotAChassis.class) {
                if (instance == null) {
                    instance = new RobotAChassis();
                }
            }
        }
        return instance;
    }

    public void connect(String ip, String port) {
        System.out.println("RobotAChassis connect ip = " + ip + ",port = " + port);
    }

    public void connect(String ip) {
        System.out.println("RobotAChassis connect ip = " + ip);
    }

    public void setSpeed(String speed) {
        System.out.println("RobotAChassis setSpeed ");
    }

    public void pauseTask() {
        System.out.println("RobotAChassis pauseTask ");
    }
}
