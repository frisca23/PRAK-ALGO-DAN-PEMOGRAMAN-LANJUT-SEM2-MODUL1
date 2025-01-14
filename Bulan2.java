import java.util.Scanner;
public class Bulan2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor bulan (1-12): ");
        int bulan = scanner.nextInt();
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        int jumlahHari;
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
                System.out.println("Nomor bulan tidak valid!");
                return;
        }

        System.out.println("Bulan " + getNamaBulan(bulan) + " " + tahun + " memiliki " + jumlahHari + " hari.");
    }

    private static String getNamaBulan(int bulan) {
        switch (bulan) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "";
        }
    }
}