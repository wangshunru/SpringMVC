package com.baizhi.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/3.
 */
@Component
public class Address {
    private String city;
    private String area;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
