//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    /* Okul Otomasyonu
Öğrenci isimleri List<String> içinde saklansın.
Belirtilen her bir akış için metot yazılacak.
Uygulamanın Akış Sırası
1- Öğrenci Ekle +
2- Öğrenciler Listelenecek +
3- Seçilen öğrenci listeden silinecek +
4- Liste içinde herhangi bir öğrenci aranacak aranan öğrenci listede varsa aradığınız öğrenci listede bulunuyor denilecek +
5- Öğrenci Bilgisi güncellenecek(Sadece isimler tutulsun ve isim bilgisi güncellensin)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Benito");
        list.add("Antonio");
        list.add("Martinez");
        list.add("Ocasio");

        list.sort(null);

        for (String item : list) {
            System.out.println(item);
        }
        //  list.remove("Martinez");
        //for(String item : list) {
        //  System.out.println(list);
        //}

        // System.out.println(list.contains("Martinez"));

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Aradığınız öğrenci adını giriniz:");
            String item = scanner.next();

            boolean bulundu = list.contains(item);
            if (bulundu) {
                System.out.println("Aradığınız öğrenci listede bulunuyor.");
            } else {
                System.out.println("Aradığınız öğrenci listede bulunmamaktadır.");
            }

       list.remove("Benito");
            list.add("Bad Bunny");
            list.sort(null);
            for(String isim : list){
                System.out.println(isim);
            }
        }
    }
}


