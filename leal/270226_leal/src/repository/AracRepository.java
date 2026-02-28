package repository;

import model.Arac;
import java.util.ArrayList;
import java.util.List;

public class AracRepository {
    private static List<Arac> aracListesi = new ArrayList<>();

    public void ekle(Arac arac) {
        aracListesi.add(arac);
    }
    public void sil(int index) {
        if (index >= 0 && index< aracListesi.size()) {
            aracListesi.remove(index);
        } else {
            System.out.println("Geçersiz index.");
        }
    }
    public void guncelle(int index, Arac yeniArac) {
        if (index >= 0 && index < aracListesi.size()) {
            aracListesi.set(index, yeniArac); }
        else  {
            System.out.println("Geçersiz index.");
        }
    }

    public List<Arac> listele() {
        return aracListesi;
    }
}
