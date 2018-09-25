package com.design.pattern.proxy;

import java.util.ArrayList;

public class RobotInit {

    public static final int A_INDEX = 0;
    public static final int B_INDEX = 1;
    public static final int C_INDEX = 2;

    @SuppressWarnings("unused")
    private IRobotBaseControl iRobotBaseControl;

    private IRobotAControl iRobotAControl;
    private IRobotAControl iRobotAProxy;

    private IRobotBControl iRobotBControl;
    private IRobotBControl iRobotBProxy;

    private RobotType robotType;

    public enum RobotType {
        A(0), B(1), C(2);

        @SuppressWarnings("unused")
        private final int value;

        private RobotType(int value) {
            this.value = value;
        }

        public static RobotType valueOf(int value) {
            switch (value) {
            case 0:
                return RobotType.A;
            case 1:
                return RobotType.B;
            case 2:
                return RobotType.C;
            default:
                return null;
            }
        }
    }

    private static RobotInit robotInit;

    private RobotInit() {
    }

    public static RobotInit getInstance() {
        if (robotInit == null) {
            synchronized (RobotInit.class) {
                if (robotInit == null) {
                    robotInit = new RobotInit();
                }
            }
        }
        return robotInit;
    }

    public void initRobotByType(int robotIndex) {
        robotType = RobotType.valueOf(robotIndex);
        switch (robotType) {
        case A:
            initRobotAChassis();
            break;
        case B:
            initRobotBChassis();
            break;
        case C:
            // TODO
            break;
        default:
            break;
        }
    }

    public void initRobot() {
        initRobotAChassis();
        initRobotBChassis();
    }

    private void initRobotAChassis() {
        iRobotAControl = new RobotAControl();
        iRobotAProxy = new RobotAProxy(iRobotAControl);
    }

    private void initRobotBChassis() {
        iRobotBControl = new RobotBControl();
        iRobotBProxy = new RobotBProxy(iRobotBControl);
    }

    public void connect() {
        switch (robotType) {
        case A:
            iRobotAProxy.connect("192.168.1.1", "8080");
            break;
        case B:
            iRobotBProxy.connect("172.168.1.1", "8000");
            break;
        default:
            break;
        }
    }

    public void startTask() {
        if (iRobotBProxy != null) {
            iRobotBProxy.startTask();
        } else {
            System.out.println("RobotInit.startTask iRobotBProxy is null.");
        }
    }

    public void startPatrol() {
        // add patrol function
        if (iRobotBProxy != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Location 1");
            arrayList.add("Location 2");
            iRobotBProxy.startPatrol(arrayList);
        } else {
            System.out.println("RobotInit.startPatrol iRobotBProxy is null.");
        }
    }

    public void uploadMap() {
        if (iRobotBProxy != null) {
            iRobotBProxy.uploadMap("/sdcard/Download/", "south.txt");
        } else {
            System.out.println("RobotInit.uploadMap iRobotBProxy is null.");
        }
    }

    public void pauseTask() {
        if (iRobotAProxy != null) {
            iRobotAProxy.pauseTask();
        } else {
            System.out.println("RobotInit.pauseTask iRobotAProxy is null.");
        }
    }

}
