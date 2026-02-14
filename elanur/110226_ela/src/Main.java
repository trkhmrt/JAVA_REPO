import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> ogrenciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("ÖĞRENCİ YÖNETİM SİSTEMİ");
            System.out.println("1: Ekle  2: Listele  3: Sil  4: Ara  5: Güncelle");
            System.out.print("Seçiminiz : ");

            String secim = scan.nextLine();

            if (secim.equals("1")) {
                System.out.print("Öğrenci adı: ");
                String isim = scan.nextLine();
                ogrenciList.add(isim);
                System.out.println(isim + " eklendi.");

            } else if (secim.equals("2")) {
                if (ogrenciList.isEmpty()) {
                    System.out.println("Liste boş.");
                } else {
                    System.out.println("Güncel Liste" + ogrenciList);
                }

            } else if (secim.equals("3")) {
                if (ogrenciList.isEmpty()) {
                    System.out.println("Liste boş işlem yapılamıyor");
                } else {
                    System.out.print("Silinecek isim : ");
                    String silinecek = scan.nextLine();
                    if (ogrenciList.remove(silinecek)) {
                        System.out.println(silinecek + " silindi.");
                    } else {
                        System.out.println("İsim bulunamadı");
                    }
                }

            } else if (secim.equals("4")) {
                System.out.print("Aranacak isim : ");
                String aranan = scan.nextLine();
                if (ogrenciList.contains(aranan)) {
                    System.out.println(aranan + " listede bulunuyor");
                } else {
                    System.out.println(aranan + " listede bulunmuyor.");
                }

            } else if (secim.equals("5")) {
                if (ogrenciList.isEmpty()) {
                    System.out.println("Liste boş.");
                } else {
                    System.out.print("Güncellenecek isim: ");
                    String exIsim = scan.nextLine();
                    if (ogrenciList.contains(exIsim)) {
                        int index = ogrenciList.indexOf(exIsim);
                        System.out.print("Yeni isim : ");
                        String yeniIsim = scan.nextLine();
                        ogrenciList.set(index, yeniIsim);
                        System.out.println("Güncellendi");
                    } else {
                        System.out.println("İsim bulunamadı");
                    }
                }
            } else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }
    }
}