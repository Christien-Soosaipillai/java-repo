package com.christien.googleguice.introduction.usingnewkeyword;

import java.util.List;

public class Order {

    private List<Double> orderLog;

    public Order(List<Double> orderLog) {
        this.orderLog = orderLog;
    }

    public List<Double> getOrderLog() {
        return orderLog;
    }
}
