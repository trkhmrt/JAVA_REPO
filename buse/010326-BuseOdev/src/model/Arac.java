package model;

public class Arac {

    private int id;
    private int kapiSayisi;
    private String renk;
    private String marka;

    public Arac() {
    }

    public Arac(int id, int kapiSayisi, String renk, String marka) {
        this.id = id;
        this.kapiSayisi = kapiSayisi;
        this.renk = renk;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Kapı Sayısı: " + kapiSayisi +
                " | Renk: " + renk +
                " | Marka: " + marka;
    }
}
