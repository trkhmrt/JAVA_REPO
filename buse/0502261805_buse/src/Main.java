//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /* Ödev 1: Sayı Analiz Makinesi
Amaç: Temel döngü mantığını, kullanıcıdan veri almayı ve sayılar arasındaki mantıksal farkları (tek/çift, pozitif/negatif) kavramak.

Soru Metni:
"Kullanıcıdan kaç adet sayı girmek istediğini soran bir Java programı yazınız. Program, girilen sayı adedi kadar dönecek bir for döngüsü kullanmalıdır. Her sayı girildiğinde şu kontrolleri yapmalıdır:
Sayı 0'dan büyük VE çift ise ekrana "Pozitif Çift Sayı" yazmalı.
Sayı 0'dan küçük VEYA tek ise ekrana "Negatif veya Tek Sayı" yazmalı.
Sayı 0 ise "Sıfır Girildi" yazmalı.
Döngü sonunda, girilen tüm sayıların toplamını ekrana yazdırmalıdır." */

    Scanner scanner = new Scanner(System.in);
    System.out.print("Kaç adet sayı gıreceksınız:");
    int adet = scanner.nextInt();

    int toplam = 0;

    for (int i = 0; i < adet; i++) {
        System.out.print(i + 1 + "." + "Sayıyı gırın");
        int sayı = scanner.nextInt();

        toplam += sayı;


        if (sayı == 0) {
            System.out.println("Sıfır Girildi");
        } else if (sayı > 0 && sayı % 2 == 0) {
            System.out.println("Pozitif Çift Sayı");
        } else {
            System.out.println("Negatif veya Tek Sayı");
        }
    }
    System.out.println("Girilen sayıların toplamı: " + toplam);
    }
