package com.example.ingodwetrust;

public class CountSingleton {
    private static CountSingleton instance;
    private int count;

    private CountSingleton() {

    }

    public static CountSingleton getInstance() {
        if (instance == null) {
            instance = new CountSingleton();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
