package org.dstu.domain;

public class Geometric extends Progression {
    private String highestvalue;
    private String constant;

    private int finalvalue;

    public Geometric() {
    }

    public Geometric(String[] data) {
        super(data[1], data[2], data[3]);
        this.constant = data[4];
        this.highestvalue = data[5];
        this.finalvalue = Integer.parseInt(data[6]);
    }

    public String getHighestvalue() {
        return highestvalue;
    }

    public void setHighestvalue(String highestvalue) {
        this.highestvalue = highestvalue;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public int getFinalvalue() {
        return finalvalue;
    }

    public void setFinalvalue(int finalvalue) {
        this.finalvalue = finalvalue;
    }

    @Override
    public String toString() {
        return super.toString() + "Geometric{" +
                "highestvalue='" + highestvalue + '\'' +
                ", constant='" + constant + '\'' +
                ", finalvalue='" + finalvalue + '\'' +
                '}';
    }
}
