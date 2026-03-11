package service;

import model.Arac;
import repository.AracRepository;
import java.util.List;

public class AracService {

    private AracRepository repository = new AracRepository();

    public void aracEkle(int kapi, String renk, String marka) {
        Arac arac = new Arac(kapi, renk, marka);
        repository.ekle(arac);
    }
    public void aracSil(int index) {
        repository.sil(index);
    }
    public void aracGuncelle(int index, int kapi, String renk, String marka) {
        Arac yeniArac = new Arac(kapi, renk, marka);
        repository.guncelle(index, yeniArac);
    }
    public void araclariListele() {
        List<Arac> liste = repository.listele();

        for (int i=0; i < liste.size(); i++) {
            System.out.println(i + "-" + liste.get(i));
        }
    }
}
