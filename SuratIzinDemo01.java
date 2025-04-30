/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGNES TITANIA
 */
import java.util.Scanner;
public class SuratIzinDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat01 stackSurat = new StackSurat01(10);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scanner.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();

                    Surat01 surat = new Surat01(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2:
                    Surat01 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " sedang diproses.");
                    }
                    break;

                case 3:
                    Surat01 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scanner.nextLine();
                    if (stackSurat.cariSurat(cariNama)) {
                        System.out.println("Surat izin ditemukan untuk " + cariNama);
                    } else {
                        System.out.println("Tidak ada surat izin untuk " + cariNama);
                    }
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan >= 1 && pilihan <= 4);
    }
}
