package com.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class TraverseLocation extends Location {

    /**
     * 遍历形式的坐标点。
     */
    @Override
    List<LocationInfo> generateLocation() {
        List<LocationInfo> locationInfos = new ArrayList<LocationInfo>();
        locationInfos.add(new LocationInfo("1.0000000", "2.000000", "3.000000"));
        locationInfos.add(new LocationInfo("1.0000000", "3.000000", "4.000000"));
        locationInfos.add(new LocationInfo("1.0000000", "4.000000", "5.000000"));
        return locationInfos;
    }

}
