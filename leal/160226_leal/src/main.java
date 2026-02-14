import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        List<String> ogrenciler = new ArrayList<>();

        int secim;

        System.out.println("1-Öğrenci ekle.");
        System.out.println("2-Öğrenci listele");
        System.out.println("3-öğrenci sil");
        System.out.println("4-öğrenci ara");
        System.out.println("5-öğrenci güncelle");
        System.out.println("çıkış");

        System.out.println("Seçim:");
        secim = scanner.nextInt();
        scanner.nextInt();

        if(secim==1) {
            System.out.println("İsim gir: ");
            String isim = scanner.nextLine();
            ogrenciler.add(isim);
            System.out.println("Eklendi");
        }
        else if (secim==2) {
            System.out.println("Öğrenci Listesi: ");
            for (String ogrenci : ogrenciler) {
                System.out.println(ogrenci);
            }
        }
        else if (secim==3) {
            System.out.println("Silinecek isim: ");
            String isim = scanner.nextLine();
            ogrenciler.remove(isim);
            System.out.println("Silme işlemi tamamlandı");
        }
        else if (secim==4) {
            System.out.println("Aranacak isim: ");
            String isim = scanner.nextLine();

            if (ogrenciler.contains(isim)) {
                System.out.println("Aradığınız isim listede bulunuyor.");
            } else {
                System.out.println("Öğrenci bulunamadı.");
            }
            }
        else if (secim==5 {
            System.out.println("Eski isim: ");
            String eski = scanner.nextLine();

            int index = ogrenciler.indexOf(eski);

            if (index!=-1) {
                System.out.println("Yeni isim: ");
                String yeni = scanner.nextLine();
                ogrenciler.set(index, yeni);
                System.out.println("Güncellendi.");
            }
            else {
                System.out.println("Öğrenci bulunamadı.");
            }
        }
        while (secim!=0);

        System.out.println("Program bitti");


    }

}
