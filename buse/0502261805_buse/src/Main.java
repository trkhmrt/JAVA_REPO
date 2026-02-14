//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* void main() {
    /* Ödev 1: Sayı Analiz Makinesi
Amaç: Temel döngü mantığını, kullanıcıdan veri almayı ve sayılar arasındaki mantıksal farkları (tek/çift, pozitif/negatif) kavramak.

Soru Metni:
"Kullanıcıdan kaç adet sayı girmek istediğini soran bir Java programı yazınız. Program, girilen sayı adedi kadar dönecek bir for döngüsü kullanmalıdır. Her sayı girildiğinde şu kontrolleri yapmalıdır:
Sayı 0'dan büyük VE çift ise ekrana "Pozitif Çift Sayı" yazmalı.
Sayı 0'dan küçük VEYA tek ise ekrana "Negatif veya Tek Sayı" yazmalı.
Sayı 0 ise "Sıfır Girildi" yazmalı.
Döngü sonunda, girilen tüm sayıların toplamını ekrana yazdırmalıdır." */

  /*  Scanner scanner = new Scanner(System.in);
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
     */

/* Ödev 2: Sınıf Başarı Takibi ve Ortalama Hesaplama
Amaç: Belirli aralıklardaki verileri filtrelemeyi (if-else if), mantıksal operatörleri ve döngü içinde veri biriktirerek matematiksel sonuç (ortalama) üretmeyi öğrenmek.

Soru Metni:

"Bir öğretmenin sınıfındaki öğrencilerin notlarını girmesini sağlayan bir simülasyon hazırlayınız.
Program başında kullanıcıdan öğrenci sayısı alınmalıdır.
for döngüsü ile her öğrencinin notu sırayla istenmelidir.
Kontrol Mekanizması: Eğer girilen not 0-100 aralığı dışında ise "Hatalı not girdiniz" uyarısı vermeli ve bu notu ortalamaya dahil etmemelidir.
+Değerlendirme: > * Not 85 ve 100 arasındaysa "Takdir Alabilir",
+Not 50 ve üzerindeyse "Geçti",
+Not 50'den küçükse "Kaldı" mesajı verilmelidir.
Sonuç: Programın sonunda sınıfın not ortalaması ekrana yazdırılmalıdır." */

/*
    Scanner scanner = new Scanner(System.in);

    System.out.print("Öğrenci sayısını giriniz: ");
    int adet = scanner.nextInt();

    int toplam = 0;
    int gecerliNotSayisi = 0;

    for (int i = 0; i < adet; i++) {
        System.out.print((i + 1) + ". öğrencinin notunu giriniz: ");
        int not = scanner.nextInt();


        if (not < 0 || not > 100) {
            System.out.println("Hatalı not girdiniz");
            continue;
        }

        toplam += not;
        gecerliNotSayisi++;

        if (not >= 85) {
            System.out.println("Takdir Alabilir");
        } else if (not >= 50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }
    }

    if (gecerliNotSayisi > 0) {
        double ortalama = (double) toplam / gecerliNotSayisi;
        System.out.println("Sınıfın not ortalaması: " + ortalama);
    } else {
        System.out.println("Geçerli not girilmedi, ortalama hesaplanamadı.");
    }
}
*/