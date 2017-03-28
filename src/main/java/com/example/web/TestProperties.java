package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/16.
 */
@Component
public class TestProperties {
        @Value("${com.zhh.name}")
        private  String name;

        @Value("${com.zhh.title}")
        private  String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
