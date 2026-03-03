import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- ÖĞRENCİ YÖNETİM SİSTEMİ ---");
            System.out.println("1: Öğrenci Ekle | 2: Öğrenci Listele | 3: Öğrenci Sil | 4: Öğrenci Ara | 5: Öğrenci Güncelle | 0: Çıkış");
            System.out.print("Seçiminiz: ");

            String secim = scan.nextLine();

            if (secim.equals("1")) ogrenciEkle();
            else if (secim.equals("2")) ogrenciListele();
            else if (secim.equals("3")) ogrenciSil();
            else if (secim.equals("4")) ogrenciAra();
            else if (secim.equals("5")) ogrenciGuncelle();
            else if (secim.equals("0")) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        }
    }

    // 1- ÖĞRENCİ EKLEME METODU
    static void ogrenciEkle() {
        System.out.print("Öğrenci adı: ");
        String isim = scan.nextLine();
        ogrenciList.add(isim);
        System.out.println(isim + " başarıyla eklendi.");
    }

    // 2- ÖĞRENCİ LİSTELEME METODU
    static void ogrenciListele() {
        if (ogrenciList.isEmpty()) {
            System.out.println("Liste şu an boş.");
        } else {
            System.out.println("Öğrenci Listesi: " + ogrenciList);
        }
    }

    // 3- ÖĞRENCİ SİLME METODU
    static void ogrenciSil() {
        if (ogrenciList.isEmpty()) {
            System.out.println("Liste boş, silinecek kimse yok.");
            return;
        }
        System.out.print("Silinecek isim: ");
        String silinecek = scan.nextLine();

        if (ogrenciList.remove(silinecek)) {
            System.out.println(silinecek + " silindi.");
        } else {
            System.out.println("İsim bulunamadı.");
        }
    }

    // 4- ÖĞRENCİ ARAMA METODU
    static void ogrenciAra() {
        System.out.print("Aranacak isim: ");
        String aranan = scan.nextLine();
        if (ogrenciList.contains(aranan)) {
            System.out.println("Aradığınız öğrenci listede bulunuyor.");
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }

    // 5- ÖĞRENCİ GÜNCELLEME METODU
    static void ogrenciGuncelle() {
        if (ogrenciList.isEmpty()) {
            System.out.println("Liste boş.");
            return;
        }
        System.out.print("Güncellenecek (eski) isim: ");
        String exIsim = scan.nextLine();
        int index = ogrenciList.indexOf(exIsim);

        if (index != -1) {
            System.out.print("Yeni isim: ");
            String yeniIsim = scan.nextLine();
            ogrenciList.set(index, yeniIsim);
            System.out.println("İsim güncellendi.");
        } else {
            System.out.println("Böyle bir öğrenci bulunamadı.");
        }
    }
}