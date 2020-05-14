package com.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class RandomLocation extends Location {

    /**
     * 漫游形式的坐标点
     */
    @Override
    List<LocationInfo> generateLocation() {
        List<LocationInfo> locationInfos = new ArrayList<LocationInfo>();
        locationInfos.add(new LocationInfo("1.0000000", "2.000000", "3.000000"));
        locationInfos.add(new LocationInfo("2.0000000", "2.000000", "3.000000"));
        locationInfos.add(new LocationInfo("3.0000000", "2.000000", "3.000000"));
        return locationInfos;
    }

}
