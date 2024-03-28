package com.example.ingodwetrust;

public class CountSingleton {
    private static CountSingleton instance;
    private int count;
    private int allcount;
    public String neededstring;

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

    public void setString(String thisget) {
        this.neededstring = thisget;
    }
    public String getString() {
        return neededstring;
    }
}
