import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new
                Scanner(System.in);

        System.out.print("KAÇ SAYI GİRECEKSİNİZ");
        int sayi = scanner.nextInt();

        System.out.println("Girdiğiniz sayı:" + sayi);
        for (int i = 0; i < sayi; i++) {

            int sayi1 = scanner.nextInt();


            if (sayi1 > 0 && sayi1 % 2 == 0) {
                System.out.println("Pozitif çift sayı");


            }
            if (sayi1 < 0 || sayi1 % 2 == 1)
            {
                System.out.println("Negatif veya tek sayı");
            }
            if (sayi1==0)
            {
                System.out.println("sıfır girildi");
            }
        }


    }
}