/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan37.programrataratanilai;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan rata-rata nilai mahasiswa.
 * 
 */

public class Mahasiswa {
    public double nilai = 0;
    public int mahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    public double rataRata() {
        return nilai / mahasiswa;
    }
}
