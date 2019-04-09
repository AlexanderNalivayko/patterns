package com.epam.pool.task11_flyweight;

public abstract class Bacteria {

    protected String name;
    protected String group;

    public String toString(){
        return name + group;
    }
}
