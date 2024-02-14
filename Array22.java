/**
 * Array22
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Array22 {
    private static List<List> arrayMatakuliah22 = new ArrayList<>();
    private static  Scanner safrizal22 = new Scanner(System.in);
    public static void main(String[] args) {
     // Daftar matakuliah dan bobot SKS
     String[] course = {
        "Pancasila",
        "Konsep Teknologi Informasi",
        "Critical Thinking dan Problem Solving",
        "Matematika Dasar",
        "Bahasa Inggris",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Keselamatan dan Kesehatan Kerja"
    };
        System.out.println("================================================================================================");
        System.out.println("                                          Hitung Nilai IP Seoul University                       ");
        System.out.println("================================================================================================");

        Scanner safrizal22 = new Scanner(System.in);

        int[] sks = {2,2,2,3,2,2,3,2};
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        double ip, totalIP = 0, ipSemester;
        int totalSKS = 0;

        for (int i = 0; i < course.length; i++) {
            System.out.print("Masukkan nilai angka untuk course " + course[i] + ": ");
            nilaiAngka[i] = safrizal22.nextDouble();

            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] <= 79 && nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] <= 72 && nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] <= 64 && nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] <= 59 && nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] <= 49 && nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("================================================================================================");
        System.out.println("                                            Hasil Konversi Nilai                                ");
        System.out.println("================================================================================================");

        System.out.printf("%-40s %-15s %-15s %-15s \n", "course", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0;i < course.length;i++) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", course[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        for (int i = 0;i < course.length;i++) {
            ip = bobotNilai[i] * sks[i];
            totalIP += ip;
            totalSKS += sks[i];
        }

        ipSemester = totalIP/totalSKS;
        System.out.printf("IP anda adalah " + "%.2f", ipSemester);
    }
}