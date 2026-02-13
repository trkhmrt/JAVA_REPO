import java.util.Scanner ;

/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Girilecek sayi adedi :  ");
        int adet = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayi : ");
            int sayi = scanner.nextInt();

            if (sayi > 0 && sayi % 2 == 0) {
                System.out.println("Pozitif Çift Sayı");
            }
            else if (sayi < 0 || sayi % 2 != 0) {
                System.out.println("Negatif veya Tek Sayi");
            }
            else if (sayi == 0) {
                System.out.println("Sifir Girildi");
            }

            toplam += sayi;
        }

        System.out.println("Sayilarin toplami :  " + toplam);
        scanner.close();
    }
} */


 public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Öğrenci sayisi : ");
        int sayi = scan.nextInt();
        int uygunNot = 0;
        int toplamNot = 0;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". not : ");
            int not = scan.nextInt();

            if (not < 0 || not > 100) {
                System.out.println("Hatalı not girdiniz");
                continue;
            }

            toplamNot += not;
            uygunNot++;

            if (not >= 85) {
                System.out.println("Takdir Alabilir");
            } else if (not >= 50) {
                System.out.println("Geçti");
            } else {
                System.out.println("Kaldı");
            }
        }
            double ort = (double) toplamNot / uygunNot;
            System.out.println("Not ortalaması: " + ort);


        scan.close();
}
}
