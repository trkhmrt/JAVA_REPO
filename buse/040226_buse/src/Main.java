//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String rol = "admin";
        if (rol == "user") {
            System.out.println("Sınırlı erişim");
        } else if (rol == "admin") {
            System.out.println("Tam yetkili");
        } else if (rol == "dbmaster") {
            System.out.println("Tam veri tabanı yetkisi");
        } else {
            System.out.println("Yetki yok");
        }
    }
}


