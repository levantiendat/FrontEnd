package com.example.frontend;

public class Classname {
    private String lophp;
    private int current;
    private int max;

    public Classname(String lophp, int current, int max) {
        this.lophp = lophp;
        this.current = current;
        this.max = max;
    }

    public Classname() {
        this.lophp = "";
        this.current = 0;
        this.max = 0;
    }

    public String getLophp() {
        return lophp;
    }

    public void setLophp(String lophp) {
        this.lophp = lophp;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
