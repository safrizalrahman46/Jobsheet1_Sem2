/**
 * HitungNilaiAkhir22
 */

 
import java.util.Scanner;

public class HitungNilaiAkhir22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input komponen nilai
        System.out.print("Masukkan nilai tugas: ");
        int tugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = scanner.nextInt();

        // Memanggil fungsi untuk menghitung nilai akhir
        Object[] hasil = hitungNilaiAkhir(tugas, kuis, uts, uas);

        // Menampilkan output
        if (hasil[0].equals("nilai tidak valid")) {
            System.out.println("Output: " + hasil[0]);
        } else {
            System.out.println("Program Menghitung Nilai Akhir: ");
            System.out.println("Nilai Tugas = " + tugas);
            System.out.println("Nilai Kuis  = " + kuis);
            System.out.println("Nilai UTS = " + uts);
            System.out.println("Nilai UAS  = " + uas);
            
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("Nilai akhir: " + hasil[0]);
            System.out.println("Nilai huruf: " + hasil[1]);
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("" + hasil[2]);
            System.out.println("===================================");
        }
    }

    public static Object[] hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        Object[] result = new Object[3];

        // Memeriksa apakah nilai masukan valid (0-100)
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            result[0] = "nilai tidak valid";
            return result;
        }

        // Menghitung nilai akhir
        //
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;

        // Mengkonversi nilai ke huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Menentukan keterangan LULUS/TIDAK LULUS
        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";

        result[0] = nilaiAkhir;
        result[1] = nilaiHuruf;
        result[2] = keterangan;

        return result;
    }
}
