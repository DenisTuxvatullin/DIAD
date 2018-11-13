package com.company;
/**
 * Created by Денис on 13.11.2018.
 */
//Класс расстояние, хранит данные
public class Distance {
    private Integer min;

    private Integer max;

    public Distance(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
