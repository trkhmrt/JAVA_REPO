public class Main {
    public static void main(String[] args){

        String rol = "dbmaster";

        if (rol.equals("admin")) {
            System.out.println("Tam yetki");
        }
        else if (rol == "user") {
            System.out.println("Sinirli erisim");
        }
        else if (rol =="dbmaster") {
            System.out.println("Tam veri tabani yetkisi");
        }
        else {
            System.out.println("Yetkiniz bulunmamakta");
        }
    }
}