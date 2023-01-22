package org.example.courier;

import org.apache.commons.lang3.RandomStringUtils;

public class CourierGenerator {
    public CourierCreate generic(){
        return new CourierCreate("Jack", "fgfh6jghj","Sparrow");
    }
    public CourierCreate random(){
        return new CourierCreate(RandomStringUtils.randomAlphanumeric(10), "fgfh6jghj","Sparrow");
    }
}
