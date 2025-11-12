import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] Pesanan = new String[jumlah];
        int[] harga = new int[jumlah];

        for (int i = 0; i < Pesanan.length; i++) {
            System.out.print("Masukan Nama Pesanan Ke-" + (i + 1) + ": ");
            Pesanan[i] = sc.nextLine();

            System.out.print("Masukan Harga Pesanan " + Pesanan[i] + ": Rp.");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
        // tot biaya
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += harga[i];
        }

        // tampilan daftar pesanan & tot biaya
        System.out.println("=== Daftar Pesanan ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(Pesanan[i] + ":  Rp." + harga[i]);
        }
        System.out.println("Total Biaya: Rp." + total);
    }
}
