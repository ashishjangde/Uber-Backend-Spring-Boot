package com.example.uberbackendspringboot.utils;


import com.example.uberbackendspringboot.dto.PointDto;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.stereotype.Service;

@Service
public class GeometryUtils {

    public Point covertPointDtoToPoint(PointDto pointDto) {
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
        Coordinate coordinate = new Coordinate(pointDto.getCoordinates()[0], pointDto.getCoordinates()[1]);
        return geometryFactory.createPoint(coordinate);
    }
}
