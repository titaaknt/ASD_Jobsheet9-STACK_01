import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);
        StackKonversi01 konversi = new StackKonversi01(); // untuk konversi biner
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
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa01 mhs = new Mahasiswa01(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas berhasil dikumpulkan.");
                    break;

                case 2:
                    Mahasiswa01 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);

                        // Konversi ke biner
                        String biner = konversi.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa01 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dari " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar tugas:");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa01 pertama = stack.peekBottom();
                    if (pertama != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + pertama.nama);
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.countTugas());
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 6);
    }
}
