import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilecek sayi adedi :  ");
        int adet = scanner.nextInt();
        int toplam = 0;
        int i;

        for (i=1 ; i <= adet; i++) {
            int sayi =scanner.nextInt();

            if (sayi < 0  || sayi%2 == 1) {
                System.out.println("Negatif veya Tek Sayi");
            } else if (sayi > 0 && sayi%2 == 0) {
                System.out.println("Pozitif Cift Sayi");
            } else if (sayi == 0 ) {
                System.out.println("Sifir Girildi");
            }
            toplam += sayi;
        }

        System.out.println("Girilen sayilarin toplami : " + toplam);
        scanner.close();
    }
}