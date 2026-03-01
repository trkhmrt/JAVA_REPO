package service;

import model.Arac;
import repository.AracRepository;
import java.util.Scanner;

public class AracService {

    Scanner scanner = new Scanner(System.in);
    static int idSayac = 1;

    public void aracEkle(Arac arac){
        arac.setId(idSayac++);
        AracRepository.aracListesi.add(arac);
        System.out.println("Araç eklendi.");
    }

    public void aracSil(int id){
        AracRepository.aracListesi.removeIf(a -> a.getId() == id);
        System.out.println("Araç silindi.");
    }

    public void aracGuncelle(int id){
        for(Arac a : AracRepository.aracListesi){
            if(a.getId() == id){

                System.out.print("Yeni Kapı Sayısı: ");
                a.setKapiSayisi(scanner.nextInt());

                System.out.print("Yeni Renk: ");
                a.setRenk(scanner.next());

                System.out.print("Yeni Marka: ");
                a.setMarka(scanner.next());

                System.out.println("Araç güncellendi.");
                return;
            }
        }
        System.out.println("Araç bulunamadı.");
    }

    public void aracListele(){
        for(Arac a : AracRepository.aracListesi){
            System.out.println(a);
        }
    }
}
