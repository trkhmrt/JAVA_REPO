package model;

public class Arac {

    private int kapiSayisi;
    private String renk;
    private String marka;

    public int Arac(int kapiSayisi, String renk, String marka) {
        this.kapiSayisi=kapiSayisi;
        this.renk=renk;
        this.marka=marka;
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
        return "Marka :" + marka +
                ", Renk :" + renk +
                ", Kapı Sayısı :" + kapiSayisi;
    }
}
