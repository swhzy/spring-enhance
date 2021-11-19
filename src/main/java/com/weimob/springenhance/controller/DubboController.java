package com.weimob.springenhance.controller;

import com.weimob.springenhance.context.DubboClassContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/dubboServer")
public class DubboController {
    @Autowired
    private DubboClassContainer dubboClassContainer;

    @RequestMapping("/{className}/{methodName}")
    public Object dubboServer(@PathVariable("className")String className, @PathVariable("methodName")String methodName, @RequestBody Map<String,Object> param){


        return null;
    }
}
