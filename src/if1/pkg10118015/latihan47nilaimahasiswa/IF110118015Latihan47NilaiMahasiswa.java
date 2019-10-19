/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan47nilaimahasiswa;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program untuk Meghitung nilai akhir mahasiswa berdasarkan
 *                        nilai quiz, uts, dan uas
 */
public class IF110118015Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa(60,80,75);

        System.out.println("QUIZ \t = "+mhs.getQuiz());
        System.out.println("UTS \t = "+mhs.getUts());
        System.out.println("UAS \t = "+mhs.getUas());
        System.out.println("\nNilai Akhir = "+ mhs.nilaiAkhir());
        System.out.println("\nIndex = "+ mhs.indexNilai());
        System.out.println("Keterangan = "+ mhs.ketereangan());
    }
    
}
