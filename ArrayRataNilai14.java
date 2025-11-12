import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLulus = 0, totalTdkLulus = 0, rata2Lulus, rata2TdkLulus;
        int jumlahLulus = 0, jmlMhs, jumlahTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jumlahTdkLulus++;
            }
        }

        rata2Lulus = totalLulus / jumlahLulus;
        rata2TdkLulus = totalTdkLulus / jumlahTdkLulus;
        System.out.println("Jumlah mahasiswa yang lulus adalah: " + jumlahLulus);
        System.out.println("Rata-rata Nilai mahasiswa yang lulus adalah = " + rata2Lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus adalah: " + jumlahTdkLulus);
        System.out.println("Rata-rata Nilai mahasiswa yang tidak lulus adalah = " + rata2TdkLulus);
    }
}
