
public class RolKontrol {
    static String rol = "admin";

    public static void main(String[] args) {

        if (rol.equalsIgnoreCase("user")) {
            System.out.println("sınırlı erişim");
        }
        else if (rol.equalsIgnoreCase("admin")) {
            System.out.println("Tam Yetki");
        }
        else if (rol.equalsIgnoreCase("dmaster")) {
            System.out.println("tam veri tabanı yetkisi");
        }
        else {
            System.out.println("yetkiniz yok");
        }






    }
}
