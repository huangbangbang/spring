package com.bj.service.impl;

import com.bj.service.SomeService;
import com.bj.util.ServiceTools;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}
