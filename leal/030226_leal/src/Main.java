
public class  Main {

        public static void main(String[] args) {


            String isim = "Leal";
            String soyisim = "Candemir";
            String burc = "İkizler";
            String saat = "14.30";
            int yas = 23;

            System.out.println("İsim: " + isim);
            System.out.println("Soyisim: " + soyisim);
            System.out.println("Burç: " + burc);
            System.out.println("Saat: " + saat);
            System.out.println("Yaş: " + yas);

            if (yas >= 18) {
                System.out.println("Sonuç: 18 yaşından büyük veya eşit.");
            } else {
                System.out.println("Sonuç: 18 yaşından küçük.");
            }
        }
    }
