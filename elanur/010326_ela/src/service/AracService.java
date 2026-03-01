package service;

import model.Arac;
import repository.IAracRepository;
import util.Lists;

import java.util.Scanner;

public class AracService implements IAracRepository {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void aracEkle(Arac arac) {
        if (Lists.aracList.isEmpty()) {
            arac.setId(1);
        } else {
            int lastId = Lists.aracList.getLast().getId();
            arac.setId(lastId + 1);
        }
        Lists.aracList.add(arac);
        System.out.println("Arac eklendi. id : " + arac.getId());
    }

    @Override
    public void aracSil(int id) {
        try {
            Arac bulunanaArac = Lists.aracList.stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Arac bulunamadi"));

            Lists.aracList.remove(bulunanaArac);
            System.out.println("id: " + id + " olan arac silindi.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void aracGuncelle(int id) {
        try {
            Lists.aracList.stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .ifPresentOrElse(arac -> {
                        System.out.print("Yeni Marka: ");
                        arac.setMarka(scanner.next());

                        System.out.print("Yeni Renk: ");
                        arac.setRenk(scanner.next());

                        System.out.print("Yeni Kapi Sayisi: ");
                        arac.setKapiSayisi(scanner.nextInt());

                        System.out.println("Arac bilgileri guncellendi.");
                    }, () -> {
                        throw new RuntimeException("Arac bulunamadi");
                    });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void aracListele() {
        Lists.aracList.forEach(System.out::println);
    }
}