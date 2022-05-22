package com.idealo.service.impl;

import com.idealo.enums.FaceValue;
import com.idealo.service.TurnAroundService;
import org.springframework.stereotype.Service;

@Service
public class TurnAroundServiceImpl implements TurnAroundService {
    @Override
    public FaceValue turnaround(FaceValue faceValue) {
        if(faceValue.equals(FaceValue.NORTH))
            return FaceValue.SOUTH;
        if(faceValue.equals(FaceValue.SOUTH))
            return FaceValue.NORTH;
        if(faceValue.equals(FaceValue.EAST))
            return FaceValue.WEST;
        else
            return FaceValue.EAST;

    }
}
