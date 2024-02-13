import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HitungIpks22 {
        private static List<List> arrayMatakuliah = new ArrayList<>();
        private static  Scanner input = new Scanner(System.in);
        private static char pilihan;
    
        public static void main(String [] args){
            while(true){
                mainMenu();
            }
        }
    
        private static void mainMenu(){
            System.out.println("\nPendataan dan Perhitungan IPS (Indeks Prestasi Semester)");
            System.out.println("1. Pendataan Matakuliah");
            System.out.println("2. Perhitungan IPS");
            System.out.println("3. Update Grade");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.next().charAt(0);
    
            switch (pilihan){
                case '1':
                    pendataanMatakuliah();
                    break;
                case '2':
                    perhitunganIPS();
                    break;
                case '3':
                    updateGrade();
                    break;
                case '4':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Masukkan pilihan antara 1 - 4");
                    break;
            }
        }
    
        private static void pendataanMatakuliah(){

            

            System.out.print("Masukkan Jumlah Mata Kuliah : ");
            int jumlahMatakuliah = input.nextInt();
            for(int i = 0; i < jumlahMatakuliah; i++){
                List<String> arrayInput = new ArrayList<>();
                Scanner mk = new Scanner(System.in);
                System.out.println();
                System.out.print("Masukkan Kode Matakuliah : ");
                String kodeMatakuliah = mk.nextLine();
                System.out.print("Masukkan Nama Matakuliah :  " );
                String namaMatakuliah = mk.nextLine();
                System.out.print("Masukkan Grade Matakuliah : ");
                String gradeMatakuliah = mk.nextLine().toUpperCase();
                while (!(gradeMatakuliah.equals("A") || gradeMatakuliah.equals("B") || gradeMatakuliah.equals("C") || gradeMatakuliah.equals("D") || gradeMatakuliah.equals("E"))) {
                    System.out.print("Masukkan Grade Matakuliah A atau B atau C atau D atau E ");
                    gradeMatakuliah = input.nextLine().toUpperCase();
                }
                System.out.print("Masukkan Jumlah SKS : ");
                int jumlahSKS = mk.nextInt();
    
                arrayInput.add(kodeMatakuliah);
                arrayInput.add(namaMatakuliah);
                arrayInput.add(gradeMatakuliah);
                arrayInput.add(String.valueOf(jumlahSKS));
                arrayMatakuliah.add(arrayInput);
            }
        }
    
        private static void perhitunganIPS(){
            if(arrayMatakuliah.size() < 1){
                System.out.println("Belum ada data Matakuliah yang dimasukkan");
                return;
            }else{
                System.out.println("Matakuliah yang Anda ambil adalah: ");
                int gradeSKS = 0;
                double totalGradeSKS = 0;
                double countSKS = 0;
                for(int i = 0; i < arrayMatakuliah.size(); i++){
                    String kdMatakuliah = (arrayMatakuliah.get(i)).get(0).toString();
                    String nmMatakuliah = (arrayMatakuliah.get(i)).get(1).toString();
                    String grMataKuliah = (arrayMatakuliah.get(i)).get(2).toString().toUpperCase();
                    String sksMatakuliah = (arrayMatakuliah.get(i)).get(3).toString();
    
                    System.out.println(kdMatakuliah + "    " + nmMatakuliah + "    " + grMataKuliah + "    " + sksMatakuliah );
                    int grade;
                    switch (grMataKuliah){
                        case "A":
                            grade = 4;
                            break;
                        case "B+":
                            grade = 3.5;
                            break;
                        case "B":
                            grade = 3;
                            break;
                        case "C+":
                            grade = 2.5;
                            break;
                        case "C":
                            grade = 2;
                            break;
                        case "D":
                            grade = 1;
                            break;
                        default:
                            grade = 0;
                            break;
                    }
                    gradeSKS = grade * Integer.parseInt(sksMatakuliah);
                    totalGradeSKS = totalGradeSKS + gradeSKS;
                    countSKS = countSKS + Integer.parseInt(sksMatakuliah);
                }
    
                double nilaiIPS = totalGradeSKS / countSKS;
                System.out.println("Nilai IPS Anda adalah " + nilaiIPS);
            }
        }
    
        private static void updateGrade(){
            if(arrayMatakuliah.size() < 1){
                System.out.println("Belum ada data Matakuliah yang dimasukkan");
                return;
            }else{
                System.out.print("Masukkan kode Matakuliah : ");
                String kodeMatakuliah = input.next();
                for(int i = 0; i < arrayMatakuliah.size(); i++){
                    List<String> arrayInput = new ArrayList<>();
                    String kdMatakuliah = (arrayMatakuliah.get(i)).get(0).toString();
                    String nmMatakuliah = (arrayMatakuliah.get(i)).get(1).toString();
                    String sksMatakuliah = (arrayMatakuliah.get(i)).get(3).toString();
                    if(kodeMatakuliah.equals(kdMatakuliah)){
                        if(!kdMatakuliah.isEmpty()){
                            Scanner update = new Scanner(System.in);
                            System.out.print("Masukkan Grade Matakuliah : ");
                            String grMatakuliah = update.nextLine().toUpperCase();
                            while (!(grMatakuliah.equals("A") || grMatakuliah.equals("B") || grMatakuliah.equals("C") || grMatakuliah.equals("D") || grMatakuliah.equals("E"))){
                                System.out.println("Silakan masukkan Grade antara A, B, C, D, dan E");
                                grMatakuliah = update.nextLine().toUpperCase();
                                break;
                            }
    
                            arrayInput.add(kdMatakuliah);
                            arrayInput.add(nmMatakuliah);
                            arrayInput.add(grMatakuliah);
                            arrayInput.add(String.valueOf(sksMatakuliah));
    
                            arrayMatakuliah.set(i, arrayInput);
    
                            for(int j = 0; j < arrayMatakuliah.size(); j++){
                                String updateKdMatakuliah = (arrayMatakuliah.get(j)).get(0).toString();
                                String updateNmMatakuliah = (arrayMatakuliah.get(j)).get(1).toString();
                                String updateGrMatakuliah = (arrayMatakuliah.get(j)).get(2).toString().toUpperCase();
                                String updateSksMatakuliah = (arrayMatakuliah.get(j)).get(3).toString();
    
                                System.out.println(updateKdMatakuliah + "    " + updateNmMatakuliah + "    " + updateGrMatakuliah + "    " + updateSksMatakuliah);
                                System.out.println();
                            }
                        }else
                            System.out.println("\nKode Matakuliah tidak ditemukan. ");
                    }
                }
            }
        }
    }
