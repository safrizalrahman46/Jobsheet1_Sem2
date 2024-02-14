import java.util.Scanner;

public class Plat22 {

    // Array kode plat mobil
    static char[] KODE = {'A','B', 'D', 'E','F', 'G', 'H', 'L', 'N', 'T'};
    // Array nama kota yang berpasangan dengan kode plat mobil
    static String[][] KOTA = {
        {"Banten"},
        {"Jakarta"},
        {"Bandung"},
        {"Cirebon"},
        {"Bogor"},
        {"Pekalongan"}, 
        {"Semarang"},
        {"Surabaya"},
        {"Malang"},
        {"Tegal"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input kode plat mobil dari pengguna
        System.out.print("Masukkan kode plat mobil: ");
        char kode = scanner.next().charAt(0);

        // Mencari nama kota berdasarkan kode plat mobil
        String kota = cariKota(kode);
        if (kota != null) {
            System.out.println("Kota: " + kota);
        } else {
            System.out.println("Kode plat tidak valid.");
        }

        // Memanggil fungsi untuk menghitung kecepatan
        hitungKecepatan();

        // Memanggil fungsi untuk menghitung jarak
        hitungJarak();

        // Memanggil fungsi untuk menghitung waktu
        hitungWaktu();
    }

    // Fungsi untuk mencari nama kota berdasarkan kode plat mobil
    static String cariKota(char kode) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                return KOTA[i][0]; // Mengembalikan nama kota pertama yang berpasangan dengan kode plat mobil
            }
        }
        return null; // Mengembalikan null jika kode plat tidak ditemukan
    }

    // Fungsi untuk menghitung kecepatan
    static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Menghitung Kecepatan ===");
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    // Fungsi untuk menghitung jarak
    static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Menghitung Jarak ===");
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " km");
    }

    // Fungsi untuk menghitung waktu
    static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Menghitung Waktu ===");
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " jam");
    }
}
