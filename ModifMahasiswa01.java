/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGNES TITANIA
 */
public class ModifMahasiswa01 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    // Konstruktor
    public ModifMahasiswa01(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // -1 artinya belum dinilai
    }

    // Method untuk memberi nilai tugas
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

