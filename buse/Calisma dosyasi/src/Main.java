import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
    /*
    int yas = 18;
    if (yas >= 18) {
    System.out.println("Kişi 18 yaşından büyüktür.");
} else if (yas == 17){
        System.out.println("1 sene sonra ehliyet alabilirsiniz.");
    }else {
    System.out.println("Kişi ehliyet alamaz.");
}
                }
    for (int i = 0; i < 48; i+=4) {
        System.out.println(i);
    }
}

    List<String> Movie = new ArrayList<>[];
    movies.add("Inception")
    list.remove();
    for (sting item; list) {
        System.out.println(item); */
/*
    int[] sayılar = new int[3];
    sayılar[0]=55;
    sayılar[1]=22;
    sayılar[2]=33;
Arrays.sort(sayılar);
    for(int sayı : sayılar) {
        System.out.println(sayı);
    }
    }

    int[] sayılar = new int[4];
    sayılar[0] = 34;
    sayılar[1] = 89;
    sayılar[2] = 45;
    sayılar[3] = 23;
    Arrays.sort(sayılar);
    for (int buse : sayılar) {
        System.out.println(buse);
    }
}

    String[] Renkler = new String[3];
    Renkler[0] = "Pembe";
    Renkler[1] = "Sarı";
    Renkler[2] = "Kahverengi";
    Arrays.sort(Renkler);
    for(String renk : Renkler){
        System.out.println(renk);
    }
}

    double[] sayılar = {2, 3, 4, 5,};
    Arrays.sort(sayılar);
    for(double buse : sayılar){
        System.out.println(buse);
    }
}


    int[] sayilar = {20, 30, 90, 14};
    System.out.println("Sayilar Dizisi:" + Arrays.toString(sayilar));
}

    int[] sayilar = {20, 30, 90, 14};

    //   System.out.println("Sayilar Dizisi:" + Arrays.toString(sayilar));


    int[] sayilar2 = {10, 30, 20, 30};
    int refNO = System.identityHashCode(sayilar);
    System.out.println(refNO);
    sayilar2 = sayilar;
    //System.out.println("Sayilar2 Dizisi:" + Arrays.toString(sayilar2));

    sayilar2[0] = 39;
    int refNO2 = System.identityHashCode(sayilar2);
    System.out.println(refNO2);
    System.out.println("Sayilar Dizisi:" + Arrays.toString(sayilar));
}


    int[] sayilar = {20,30,90,14,43};


    //System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar));

    int[] sayilar2 = {10,30,20,30};
    sayilar2 = sayilar.clone();

    //System.out.println("Sayilar2 Dizisi:"+ Arrays.toString(sayilar2));
    sayilar2[0] = 39;
    //System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar2));

    int[] sayilar3 = {50};

    sayilar3 = Arrays.copyOf(sayilar,5);

    System.out.println("Sayilar3 Dizisi:"+Arrays.toString(sayilar3));



    int[] yaş = {13, 32,29};
    int[] yaş2 = {24, 35};
    yaş2 = Arrays.copyOf(yaş, 4);
    Arrays.sort(yaş2);
    for (int y : yaş2) {
        System.out.println("Yaş Sıralaması" + Arrays.toString(yaş2));
    }
}


    int[] sayılar = {20, 30, 50, 66};
    int[] sayılar2 = {45, 65};
    sayılar2 = sayılar.clone();
    sayılar2[1] = 39;
    Arrays.sort(sayılar2);
    System.out.println("Sayılar Dizisi" + Arrays.toString(sayılar2));
}



import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sayı 1i giriniz:");
            int sayı1 = scanner.nextInt();
            System.out.println("İkinci sayıyı giriniz:");
            int sayı2 = scanner.nextInt();
            int sonuç = toplama(sayı1, sayı2);
            System.out.println(sonuç);
        }
        static void selam_ver() {
            System.out.println("Merhaba Tarık \n");
        }

        static void selam_ver(String isim, Integer yas, Double kilo) {
            System.out.printf("Merhaba %s Yaş:%d Kilo:%.2f", isim, yas, kilo);
        }

        static String veriyi_kaydet_ve_haber_ver() {
            return "Veriler kaydedildi";
        }

        static int toplama(int sayı1, int sayı2) {
            return sayı1 + sayı2;
        }
    }



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Benito");
        list.add("Antonio");
        list.add("Martinez");
        list.add("Ocasio");

        list.sort(null);

        list.remove("Ocasio");

        System.out.println(list.get(0));
        System.out.println(list.getFirst());

        System.out.println(list.size()-2);
        System.out.println(list.getLast());

        System.out.println(list.contains("Benito"));
        list.clear();

        for(String item : list){
            System.out.println(item);
        }

    }
}
*/

