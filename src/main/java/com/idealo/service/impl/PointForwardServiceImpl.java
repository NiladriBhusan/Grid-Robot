package com.idealo.service.impl;

import com.idealo.constants.constants;
import com.idealo.entity.Point;
import com.idealo.enums.FaceValue;
import com.idealo.service.PointForwardService;
import org.springframework.stereotype.Service;

@Service
public class PointForwardServiceImpl implements PointForwardService {
    @Override
    public Point forward(Point currentPoint, int steps , FaceValue faceValue) {
        Point newPoint = new Point();
        int value = 0 ;
        if (faceValue == FaceValue.EAST) {
            value = currentPoint.getCoordinateX().intValue() + steps;
        }
        else if (faceValue == FaceValue.WEST){
            value = currentPoint.getCoordinateX().intValue() - steps;
        }
        value = Math.abs(value) >= constants.MAX_GRID ? constants.MAX_GRID : value;
        newPoint.setCoordinateX(value);
        newPoint.setCoordinateY(currentPoint.getCoordinateY());

        if (faceValue == FaceValue.NORTH){
            value = currentPoint.getCoordinateY().intValue() + steps;
        } else if (faceValue == FaceValue.SOUTH){
            value = currentPoint.getCoordinateY().intValue() - steps;
        }
        value = Math.abs(value) >= constants.MAX_GRID ? constants.MAX_GRID : value;
        newPoint.setCoordinateX(value);
        newPoint.setCoordinateY(currentPoint.getCoordinateY());
        return newPoint;
    }
}
