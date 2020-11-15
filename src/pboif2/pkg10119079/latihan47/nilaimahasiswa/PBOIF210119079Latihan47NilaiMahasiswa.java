package pboif2.pkg10119079.latihan47.nilaimahasiswa;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan47NilaiMahasiswa {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setQuiz(60);
        nilai.setUts(80);
        nilai.setUas(75);
        
        System.out.println("QUIZ\t= " + nilai.getQuiz());
        System.out.println("UTS\t= " + nilai.getUts());
        System.out.println("UAS\t= " + nilai.getUas());
        nilai.ket(nilai.index(nilai.nilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas())));
        
    }
    
}
