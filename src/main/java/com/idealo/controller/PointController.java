package com.idealo.controller;

import com.idealo.entity.Point;
import com.idealo.enums.FaceValue;
import com.idealo.service.PointForwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/grid")
public class PointController {

    @Autowired
    private PointForwardService pointForwardService;

    @PostMapping
    public Point pointForward(){
        /*
            These values will come from UI, for now , it has been hardcoded.
         */
        return pointForwardService.forward( new Point(1,1),2, FaceValue.EAST);
    }

}
