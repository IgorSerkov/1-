package org.dstu.domain;

public  class Arithmetic extends Progression {
    private int namber = 1;
    private String action;
    private String speciality;

    public Arithmetic() {
    }

    public Arithmetic(String[] data) {
        super(data[1], data[2], data[3]);
        this.action = data[4];
        this.namber = Integer.parseInt(data[5]);
        this.speciality = data[6];
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + "Arithmetic{" +
                "namber=" + namber +
                ", action='" + action + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
