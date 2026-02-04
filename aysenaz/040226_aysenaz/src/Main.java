//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String role = "admin";

        if (role == "user") {
            System.out.println("Sınırlı erişim.");
        }
        else if (role == "admin") {
            System.out.println("Tam yetki.");
        }
        else if (role == "dbmaster") {
            System.out.println("Tam veri tabanı yetkisi.");
        }
        else {
            System.out.println("Yetkiniz yok.");
        }
    }
}