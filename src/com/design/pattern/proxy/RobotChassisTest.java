package com.design.pattern.proxy;

public class RobotChassisTest {

    public static void main(String[] args) {
        RobotInit robotInit = RobotInit.getInstance();
        robotInit.initRobotByType(RobotInit.A_INDEX);

        robotInit.pauseTask();
        robotInit.startTask();
    }
}
