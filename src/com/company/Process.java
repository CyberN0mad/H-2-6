package com.company;

public class Process<T extends Number>
        implements Command<T> {

    @Override
    public int addition(T t, T b) {
        return t.intValue() + b.intValue();
    }

    @Override
    public long subtract(T t, T b) {
        return t.longValue() - b.longValue();
    }

    @Override
    public double multiplication(T t, T b) {
        return t.doubleValue() * b.doubleValue();
    }
}

