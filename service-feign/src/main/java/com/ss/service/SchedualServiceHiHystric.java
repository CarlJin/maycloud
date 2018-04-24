package com.ss.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-04-23 下午4:10
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
