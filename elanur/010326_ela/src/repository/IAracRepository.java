package repository;

import model.Arac;

public interface IAracRepository {
    void aracEkle(Arac arac);
    void aracSil(int id);
    void aracGuncelle(int id);
    void aracListele();
}