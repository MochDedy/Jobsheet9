import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukan Banyak Nilai yang Akan Di input: ");
        jumlah = sc.nextInt();

        // deklarasi array
        int[] arrNilai = new int[jumlah];
        // input nilai mahasiswa
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        // menghitung rata rata
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += arrNilai[i];
        }
        double rataRata = (double) total / jumlah;

        // nilai tinggi & rendah
        int nilaiTinggi = arrNilai[0];
        int nilaiRendah = arrNilai[0];
        for (int i = 1; i < arrNilai.length; i++) {
            if (arrNilai[i] > nilaiTinggi) {
                nilaiTinggi = arrNilai[i];
            }
            if (arrNilai[i] < nilaiRendah) {
                nilaiRendah = arrNilai[i];
            }
        }
        // output hasil
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + ": " + arrNilai[i]);
        }
        System.out.println("Nilai Rata-Rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + nilaiTinggi);
        System.out.println("Nilai Terendah  : " + nilaiRendah);
    }
}
