package org.skypro.skyshop.product;

public abstract class Product {
    protected final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getCost();

    public String toString() {
        return name;
    }

    public abstract boolean isSpecial();
}


