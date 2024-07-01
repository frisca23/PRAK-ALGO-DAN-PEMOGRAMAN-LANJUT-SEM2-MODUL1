import java.util.Scanner;
public class Bulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = input.nextInt();
        int jumlahHari = 0;

        // Menggunakan switch case untuk menentukan jumlah hari berdasarkan bulan
        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                if (tahun % 4 == 0) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                System.out.println("Bulan yang dimasukkan tidak valid.");
                return;
                }
        System.out.println("Jumlah hari untuk bulan " + bulan + " tahun " + tahun + ": " + jumlahHari);
    }
}
