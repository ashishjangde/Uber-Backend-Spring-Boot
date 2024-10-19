package com.example.uberbackendspringboot.config;

import com.example.uberbackendspringboot.dto.PointDto;
import com.example.uberbackendspringboot.utils.GeometryUtils;
import lombok.RequiredArgsConstructor;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ModelMapperConfig {

    private final  GeometryUtils geometryUtils;

    @Bean
    public ModelMapper modelMapper() {
      ModelMapper modelMapper = new ModelMapper();

      modelMapper.typeMap(PointDto.class , Point.class).setConverter(context -> {
          PointDto pointDto = context.getSource();
          return geometryUtils.covertPointDtoToPoint(pointDto);
      });

      modelMapper.typeMap(Point.class , PointDto.class).setConverter(context ->{
        Point point = context.getSource();
        Double[] coordinates = {
                point.getX(),
                point.getY()
        };
        return new PointDto(coordinates);
      }
      );

      return modelMapper;
    }
}
