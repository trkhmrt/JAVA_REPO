
import model.Arac;
import service.AracService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AracService aracService = new AracService();

        while(true){

            System.out.println("\n1-Ekle 2-Sil 3-Güncelle 4-Listele 5-Çıkış");
            int secim = scanner.nextInt();

            if(secim == 1){

                Arac arac = new Arac();

                System.out.print("Kapı Sayısı: ");
                arac.setKapiSayisi(scanner.nextInt());

                System.out.print("Renk: ");
                arac.setRenk(scanner.next());

                System.out.print("Marka: ");
                arac.setMarka(scanner.next());

                aracService.aracEkle(arac);
            }
            else if(secim == 2){

                System.out.print("Silinecek ID: ");
                int id = scanner.nextInt();
                aracService.aracSil(id);
            }
            else if(secim == 3){

                System.out.print("Güncellenecek ID: ");
                int id = scanner.nextInt();
                aracService.aracGuncelle(id);
            }
            else if(secim == 4){

                aracService.aracListele();
            }
            else if(secim == 5){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                System.out.println("Geçersiz seçim!");
            }
        }
    }
}