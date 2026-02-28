import service.AracService;

public class Main {
    public static void main(String[] args) {
        AracService service = new AracService();

        service.aracEkle(4, "kırmızı", "Toyota");
        service.aracEkle(2,"Mavi", "BMW");

        System.out.println("Araç Listesi:");
        service.araclariListele();

        service.aracGuncelle(0,4,"Siyah", "Mercedes");

        System.out.println("Güncellenmiş Liste:");
        service.araclariListele();

        service.aracSil(1);

        System.out.println("Silme sonrası liste:");
        service.araclariListele();
    }
}
