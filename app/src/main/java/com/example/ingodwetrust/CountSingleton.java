package com.example.ingodwetrust;

public class CountSingleton {
    private static CountSingleton instance;
    private int count;
    private int allcount;

    private CountSingleton() {

    }

    public static CountSingleton getInstance() {
        if (instance == null) {
            instance = new CountSingleton();
        }
        return instance;
    }

    public void CountUpdate() {

        allcount += count;

    }

    public int getCount() {
        return count;
    }

    public int getAllCount() {
        return allcount;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
