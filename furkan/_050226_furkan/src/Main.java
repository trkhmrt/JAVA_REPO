import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        {
//            Scanner scanner = new
//                    Scanner(System.in);
//
//            System.out.print("KAÇ SAYI GİRECEKSİNİZ");
//            int sayi = scanner.nextInt();
//
//            System.out.println("Girdiğiniz sayı:" + sayi);
//            for (int i = 0; i < sayi; i++) {
//
//                int sayi1 = scanner.nextInt();
//
//
//                if (sayi1 > 0 && sayi1 % 2 == 0) {
//                    System.out.println("Pozitif çift sayı");
//
//
//                }
//                if (sayi1 < 0 || sayi1 % 2 == 1) {
//                    System.out.println("Negatif veya tek sayı");
//                }
//                if (sayi1 == 0) {
//                    System.out.println("sıfır girildi");
//                }
//            }
//
//        }

        {
            Scanner scanner =new
                    Scanner(System.in);
            System.out.print("Kaç Öğrenci Not Girişi Yapılacak : ");
            int ogrenci_sayisi=scanner.nextInt();
            System.out.println("Ogrenci Sayısı : " +  ogrenci_sayisi);

            for(int i=0;i<ogrenci_sayisi;i++){
                System.out.print(i+1 + ".Ogrenci Notu Giriniz :" );
                int ogrenci_notu=scanner.nextInt();
                if (ogrenci_notu<=0 || ogrenci_notu>=100)
                {
                    System.out.println("Hatalı not girdiniz");
                }

                else if (ogrenci_notu>=50)
                {
                    System.out.println("Geçti");
                }
                else if (ogrenci_notu<50)
                {
                    System.out.println("Kaldınız");
                }

            }








        }


    }
}