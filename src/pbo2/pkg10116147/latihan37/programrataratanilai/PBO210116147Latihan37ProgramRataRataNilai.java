package pbo2.pkg10116147.latihan37.programrataratanilai;
import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan rata-rata nilai mahasiswa
 * 
 */

public class PBO210116147Latihan37ProgramRataRataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan banyaknya mahasiswa: ");
        mahasiswa.setMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getMahasiswa(); i++) {
            System.out.print("Nilai mahasiswa ke-"+i+": ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        System.out.println("Maka, rata-rata nilainya adalah " + mahasiswa.rataRata());
        System.out.println("\nDeveloped by Garry Prang");
    }
    
}
