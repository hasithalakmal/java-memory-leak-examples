package com.smile.service;

import com.smile.beans.GoodBean;

import java.util.Map;

public class HashSetWithoutHashFunctionFixed {

    public void buildMap() {
        Map<Object, Object> map = System.getProperties();
        for (int i=0; i< 1000000; i++) {
            map.put(new GoodBean("key"), "x");
        }
    }
}
