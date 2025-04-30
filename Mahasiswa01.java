/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGNES TITANIA
 */
public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    Mahasiswa01(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
      
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
