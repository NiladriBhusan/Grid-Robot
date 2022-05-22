package com.idealo.service.impl;

import com.idealo.service.WaitService;
import org.springframework.stereotype.Service;

@Service
public class WaitServiceImpl implements WaitService {
    @Override
    public void doWait() throws InterruptedException {
        Thread.sleep(200);
    }
}
