import model.Arac;
import service.AracService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AracService aracService = new AracService();

        while (true) {

            System.out.println("1-Arac Ekle  2-Arac Sil  3-Arac Guncelle  4-Araclari Listele");

            int secim = scanner.nextInt();

            if (secim == 1) {
                Arac yeniArac = new Arac();
                System.out.print("Marka: ");
                yeniArac.setMarka(scanner.next());
                System.out.print("Renk: ");
                yeniArac.setRenk(scanner.next());
                System.out.print("Kapi Sayisi: ");
                yeniArac.setKapiSayisi(scanner.nextInt());

                aracService.aracEkle(yeniArac);

            } else if (secim == 2) {
                System.out.print("Silinecek aracin id degerini giriniz: ");
                int id = scanner.nextInt();
                aracService.aracSil(id);

            } else if (secim == 3) {
                System.out.print("Guncellenecek aracin id degerini giriniz: ");
                int id = scanner.nextInt();
                aracService.aracGuncelle(id);

            } else if (secim == 4) {
                aracService.aracListele();

            } else {
                System.out.println("Gecersiz islem girdiniz");
            }
        }
    }
}