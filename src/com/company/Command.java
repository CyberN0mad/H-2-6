package com.company;

public interface Command <T extends Number> {
    int addition(T t, T b);
    long subtract (T t, T b);
    double multiplication(T t, T b);
}
