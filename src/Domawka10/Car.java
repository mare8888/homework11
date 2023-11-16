package Domawka10;

public class Car {
    private String fari;
    private String stekla;

    public String getFari() {
        return fari;
    }

    public void setFari(String fari) {
        if (fari != "linsi"){
            throw new RuntimeException("Fari galogen");
        }
        this.fari = fari;
    }

    public String getStekla() {
        return stekla;
    }

    public void setStekla(String stekla) {
        if (stekla != "Tonirovani"){
            throw new RuntimeException("Stekla ne tonirovani");
        }
        this.stekla = stekla;
    }

    public Car(String fari, String stekla) {
        this.fari = fari;
        this.stekla = stekla;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fari='" + fari + '\'' +
                ", stekla='" + stekla + '\'' +
                '}';
    }
}
