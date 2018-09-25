package com.design.pattern.proxy;

import java.util.ArrayList;

public interface IRobotBControl extends IRobotBaseControl {

    void startTask();

    void uploadMap(String filePath, String fileName);

    // add
    void startPatrol(ArrayList<?> arrayList);
}
