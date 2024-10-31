package org.dstu.domain;

public abstract class Progression implements IMathematics {
    private String firstMeaning;
    private String lastMeaning;
    private String patronymicMeaning;

    public Progression() {

    }

    public Progression(String firstMeaning, String lastMeaning, String patronymicMeaning) {
        this.firstMeaning = firstMeaning;
        this.lastMeaning = lastMeaning;
        this.patronymicMeaning = patronymicMeaning;
    }

    public String getFirstMeaning() {
        return firstMeaning;
    }

    public void setFirstMeaning(String firstMeaning) {
        this.firstMeaning = firstMeaning;
    }

    public String getLastMeaning() {
        return lastMeaning;
    }

    public void setLastMeaning(String lastMeaning) {
        this.lastMeaning = lastMeaning;
    }

    public String getPatronymicMeaning() {
        return patronymicMeaning;
    }

    public void setPatronymicMeaning(String patronymicMeaning) {
        this.patronymicMeaning = patronymicMeaning;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstMeaning='" + firstMeaning + '\'' +
                ", lastMeaning='" + lastMeaning + '\'' +
                ", patronymicMeaning='" + patronymicMeaning + '\'' +
                '}';
    }
}
