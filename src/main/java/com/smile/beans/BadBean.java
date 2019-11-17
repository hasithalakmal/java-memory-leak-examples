package com.smile.beans;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BadBean {
    private String key;

    public BadBean(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
