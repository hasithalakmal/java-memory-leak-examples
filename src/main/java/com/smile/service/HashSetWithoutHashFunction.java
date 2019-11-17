package com.smile.service;

import com.smile.beans.BadBean;

import java.util.Map;

public class HashSetWithoutHashFunction {

    public void buildMap() {
        Map<Object, Object> map = System.getProperties();
        for (int i=0; i< 1000000; i++) {
            map.put(new BadBean("key"), "x");
        }
    }
}
