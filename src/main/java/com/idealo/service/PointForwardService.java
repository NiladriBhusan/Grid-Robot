package com.idealo.service;

import com.idealo.entity.Point;
import com.idealo.enums.FaceValue;

public interface PointForwardService {
    Point forward (Point currentPoint, int steps , FaceValue faceValue);
}
