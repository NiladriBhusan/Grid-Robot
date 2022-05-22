package com.idealo.service.impl;

import com.idealo.enums.FaceValue;
import com.idealo.service.TurnRightService;
import org.springframework.stereotype.Service;

@Service
public class TurnRightServiceImpl implements TurnRightService {
    @Override
    public FaceValue turnRight(FaceValue faceValue) {
        if(faceValue.equals(FaceValue.NORTH))
            return FaceValue.EAST;
        if(faceValue.equals(FaceValue.EAST))
            return FaceValue.SOUTH;
        if(faceValue.equals(FaceValue.SOUTH))
            return FaceValue.WEST;
        else
            return FaceValue.NORTH;
    }
}
