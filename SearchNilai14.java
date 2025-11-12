import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        int jumlahmhs, key, posisi = -1;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahmhs = sc.nextInt();
        int[] arrNilai = new int[jumlahmhs];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan Nilai yang ingin di cari: ");
        key = sc.nextInt();

        for (int i = 0; i <arrNilai.length; i++){
            if (key == arrNilai[i]){
                posisi = i;
                break;
            }
        }

        System.out.println();
        if (posisi != -1) {
            System.out.println("Nilai " +key +" ketemu pada mahasiswa ke-" + (posisi + 1));
        } else {
            System.out.println("Nilai mahasiswa yang dicari tidak ditemukan!");
        }
        sc.close();
    }
}