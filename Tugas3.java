import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // daftar menu
        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate ice"};
                
        // input nama makanan yang di cari
        System.out.print("Masukkan Makanan/Minuman yang Diinginkan: ");
        String cari = sc.nextLine();

        // search
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("\n" + cari + ", Ditemukan Pada Menu ke-" + (i + 1));
                found = true;
                break;
            }
        }
        // output
        if (found) {
            System.out.println("\n----------------------------------");
            System.out.println(cari + " Tersedia Di Menu");
            System.out.println(" ----------------------------------");
        } else {
            System.out.println("\n----------------------------------");
            System.out.println(cari + " Tidak Tersedia Di Menu");
            System.out.println("----------------------------------");
        }
    }
}
