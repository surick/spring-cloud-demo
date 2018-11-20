package com.jinaiya.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author Jin
 * @date 2018/11/19
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
