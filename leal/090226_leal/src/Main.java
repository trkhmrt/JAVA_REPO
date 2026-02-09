import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("öğrenci sayısını giriniz");
        int ogrenciSayisi = scanner.nextInt();

        int toplamNot = 0;
        int gecerliNotSayısı = 0;

        for (int i=1; i<=  ogrenciSayisi; i++) {
            System.out.print(i + "Öğrenci notunu giriniz.");
            int not = scanner.nextInt();

            if (not < 0 || not > 100) {
                System.out.println("hatalı not girdiniz.");
                continue;
            }

            if (not >= 85) {
                System.out.println("takdir alabilir");
            } else if (not >= 50) {
                System.out.println("geçti");
            } else {
                System.out.println("kaldı");
            }

            toplamNot += not;
            gecerliNotSayısı++;
        }

        if (gecerliNotSayısı > 0) {
            double ortalama = (double) toplamNot / gecerliNotSayısı;
            System.out.println("sınıf not ortalaması:" + ortalama);
        } else {
            System.out.println("geçerli not girilmedi, ortalama hesaplanamaz.");
        }

        scanner close();
            }
        }

    }

}
