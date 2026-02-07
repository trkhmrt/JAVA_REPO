import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.print("Öğrenci sayisi : ");
            int sayi = scan.nextInt();
            int gecerliNot = 0;
            int toplamNot = 0;

            for (int i = 1; i <= sayi; i++) {
                System.out.print(i + ". not : ");
                int not = scan.nextInt();

                if (not < 0 || not > 100) {
                    System.out.println("Hatalı not girildi");
                    continue;
                }

                toplamNot += not;
                gecerliNot++;

                if (not >= 85 ) {
                    System.out.println("Takdir Alabilir");
                } else if (not >= 50) {
                    System.out.println("Geçti");
                } else {
                    System.out.println("Kaldi");
                }
            }
        scan.close();

        int ort = toplamNot / gecerliNot;
        System.out.println("Sinif not ortalamasi : " + ort);
    }
}