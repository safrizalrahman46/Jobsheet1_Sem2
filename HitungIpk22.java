import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HitungIpk22 {
    private static List<List> arrayMatakuliah = new ArrayList<>();
    private static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Daftar matakuliah dan bobot SKS
         String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        double[] bobotSKS = { 3, 4, 3, 4, 4, 2, 2, 2 };
        
        // Input nilai untuk setiap matakuliah
        double[] nilaiSetara = new double[mataKuliah.length];
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiSetara[i] = input.nextDouble();
        }
        
        // Hitung IP Semester
        double totalNilaiBobot = 0;
        double totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalNilaiBobot += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        double IPSemester = totalNilaiBobot / totalSKS;
        
        // Output hasil
        System.out.println("Hasil Konversi Nilai");
        System.out.println("MK\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + "\t\t" + nilaiSetara[i] + "\t\t" + konversiNilaiHuruf(nilaiSetara[i]) + "\t\t" + bobotSKS[i]);
        }
        System.out.println("\nIP Semester Anda: " + IPSemester);
        
        input.close();
    }
    
    // Metode untuk mengonversi nilai angka menjadi nilai huruf
    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return "A";
        } else if (nilaiAngka >= 80) {
            return "A-";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 65) {
            return "B-";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else {
            return "E";
        }
    }
        
        // double[] equivalentValues = { 3.5, 4.0, 3.0, 3.5, 4.0, 2.0, 2.0, 4.0 };

        // double totalWeightedValue = 0;
        // double totalSKS = 0;
        // double equivalentValues = 0; 

        // Input data for each course
    //     String[] courses = {
    //         "Pancasila",
    //         "Konsep Teknologi Informasi",
    //         "Critical Thinking dan Problem Solving",
    //         "Matematika Dasar",
    //         "Bahasa Inggris",
    //         "Dasar Pemrograman",
    //         "Praktikum Dasar Pemrograman",
    //         "Keselamatan dan Kesehatan Kerja"
    //     };
    //     double[] sksWeights = { 3, 3, 3, 4, 2, 3, 2, 2 };

    //     for (int i = 0; i < courses.length; i++) {
    //         System.out.print("Masukkan nilai Angka untuk MK " + courses[i] + ": ");
    //         double nilaiAngka = scanner.nextDouble();

    //         if (nilaiAngka < 0 || nilaiAngka > 100) {
    //             System.out.println("Nilai tidak valid");
    //             return;
    //         }

    //         totalWeightedValue += nilaiAngka * sksWeights[i];
    //         totalSKS += sksWeights[i];
    //     }

    //     double ipSemester = totalWeightedValue / totalSKS;

    //     System.out.println("\nIP Semester: " + ipSemester);
    //     System.out.println("Keterangan: " + getKeterangan(ipSemester));

    //         if(arrayMatakuliah.size() < 1){
    //             System.out.println("Belum ada data Matakuliah yang dimasukkan");
    //             return;
    //         }else{
    //             System.out.println("Matakuliah yang Anda ambil adalah: ");
    //             int gradeSKS = 0;
    //             double totalGradeSKS = 0;
    //             double countSKS = 0;
    //             for(int i = 0; i < arrayMatakuliah.size(); i++){
    //                 String kdMatakuliah = (arrayMatakuliah.get(i)).get(0).toString();
    //                 String nmMatakuliah = (arrayMatakuliah.get(i)).get(1).toString();
    //                 String grMataKuliah = (arrayMatakuliah.get(i)).get(2).toString().toUpperCase();
    //                 String sksMatakuliah = (arrayMatakuliah.get(i)).get(3).toString();
    
    //                 System.out.println(kdMatakuliah + "    " + nmMatakuliah + "    " + grMataKuliah + "    " + sksMatakuliah );
    //                 int grade;
    //                 switch (grMataKuliah){
    //                     case "A":
    //                         grade = 4;
    //                         break;
    //                     case "B":
    //                         grade = 3;
    //                         break;
    //                     case "C":
    //                         grade = 2;
    //                         break;
    //                     case "D":
    //                         grade = 1;
    //                         break;
    //                     default:
    //                         grade = 0;
    //                         break;
    //                 }
    //                 gradeSKS = grade * Integer.parseInt(sksMatakuliah);
    //                 totalGradeSKS = totalGradeSKS + gradeSKS;
    //                 countSKS = countSKS + Integer.parseInt(sksMatakuliah);
    //             }
    
    //             double nilaiIPS = totalGradeSKS / countSKS;
    //             System.out.println("Nilai IPS Anda adalah " + nilaiIPS);
    //         }
    //     }

    // public static String getKeterangan(double ip) {
    //     if (ip >= 2.75) {
    //         return "LULUS";
    //     } else {
    //         return "TIDAK LULUS";
    //     }
    // }
}