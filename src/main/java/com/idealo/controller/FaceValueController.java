package com.idealo.controller;

import com.idealo.entity.Point;
import com.idealo.enums.FaceValue;
import com.idealo.service.TurnAroundService;
import com.idealo.service.TurnRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/facevalue")
public class FaceValueController {

    @Autowired
    private TurnAroundService turnAroundService;
    @Autowired
    private TurnRightService turnRightService;

    @PostMapping
    @RequestMapping(path = "/turnaround")
    public FaceValue turnaround(){
        return turnAroundService.turnaround(FaceValue.EAST);
    }
    @PostMapping(path = "/turnRight")
    public FaceValue turnRight(){
        return turnRightService.turnRight(FaceValue.EAST);
    }
}
