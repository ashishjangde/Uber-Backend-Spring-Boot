package com.example.uberbackendspringboot.services.impl;

import com.example.uberbackendspringboot.services.DistanceService;
import org.locationtech.jts.geom.Point;

public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point source, Point destination) {
        return 0;
    }
}
