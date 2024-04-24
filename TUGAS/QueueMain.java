package TUGAS;
import java.util.Scanner;
public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cek posisi antrian");
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue (jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NO ID: ");
                    int noID = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jeniskelamin = sc.next().charAt(0);
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();

                    pasien  nb= new pasien( nama, noID, jeniskelamin, umur);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
            
                case 2:
                    pasien data = antri.Dequeue();
                    if (data != null) {
                        System.out.print("Antrian yang keluar: " + data.nama + " " + data.noID + " " + data.jeniskelamin + " " + data.umur);
                    }
                    break;
                case 3: 
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    pasien rearAntrian = antri.peekRear();
                    if (rearAntrian != null) {
                        System.out.println("Antrian paling belakang: "  + rearAntrian.nama + " "
                         + rearAntrian.noID+ " "  + rearAntrian.jeniskelamin+ " " + rearAntrian.umur );
                    }
                     break;
                case 6:
                    System.out.print("Masukkan nama pasien: ");
                    String namaCari = sc.nextLine();
                    int posisi = antri.peekPosition(namaCari);
                    if (posisi != -1) {
                        System.out.println("Posisi antrian pasien " + namaCari + " adalah " + posisi);
                    } else {
                        System.out.println("Pasien " + namaCari + " tidak ditemukan dalam antrian.");
                    }
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih ==6);
    }
}
