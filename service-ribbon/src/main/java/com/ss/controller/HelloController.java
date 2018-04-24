package com.ss.controller;

import com.ss.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-04-23 下午3:16
 **/
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        logger.info("HelloController:{}", name);
        return helloService.hiService(name);
    }
}
