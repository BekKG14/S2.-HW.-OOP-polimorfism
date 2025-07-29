package org.skypro.skyshop;

public class BestResultNotFound extends RuntimeException {
    private String name;

    public BestResultNotFound(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "BestResultNotFound";
    }
}
