package PRAKTIKUM2;
import java.util. Scanner;
public class QueueMain18 {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepa");
        System.out.println("4. Cek semua Antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue18 antri = new Queue18(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();

                    Nasabah18  nb= new Nasabah18(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
            
                case 2:
                    Nasabah18 data = antri.Dequeue();
                    if (!" ".equals(data.norek) && !" ".equals(data.nama) && !" ".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.print ("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " +data.saldo);
                    }
                    break;
                case 3: 
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    Nasabah18 rearAntrian = antri.peekRear();
                    if (rearAntrian != null) {
                        System.out.println("Antrian paling belakang: " + rearAntrian.norek + " " + rearAntrian.nama + " "
                         + rearAntrian.alamat + " " + rearAntrian.umur + " " + rearAntrian.saldo);
                    }
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
