import java.util.Scanner;

public class ModifMahasiswaDemo01 {
    public static void main(String[] args) {
        ModifStackTugasMahasiswa01 stack = new ModifStackTugasMahasiswa01(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama Dikumpulkan");
            System.out.println("6. Melihat Jumlah Tugas yang Dikirim");
            System.out.print("Pilih: ");
            while (!scan.hasNextInt()) { // Menangani input selain integer
                System.out.println("Pilihan tidak valid. Masukkan angka antara 1 hingga 6.");
                scan.next(); // Buang input yang tidak valid
            }
            pilih = scan.nextInt();
            scan.nextLine(); // membersihkan newline

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    ModifMahasiswa01 mhs = new ModifMahasiswa01(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    ModifMahasiswa01 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    } else {
                        System.out.println("Tidak ada tugas untuk dinilai.");
                    }
                    break;

                case 3:
                    ModifMahasiswa01 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    stack.print();
                    break;

                case 5:
                    ModifMahasiswa01 pertama = stack.peekBottom();
                    if (pertama != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + pertama.nama);
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.countTugas());
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);

        // Menutup scanner setelah selesai digunakan
        scan.close();
    }
}
