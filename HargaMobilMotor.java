import java.util.Scanner;
public class HargaMobilMotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tampilan Harga Mobil dan Motor");
        System.out.println("Silakan pilih jenis kendaraan (1. Mobil, 2. Motor):");
        int jenisKendaraan = input.nextInt();
        switch (jenisKendaraan) {
            case 1:
                System.out.println("Pilihan mobil:");
                System.out.println("1. Honda");
                System.out.println("2. Suzuki");
                int pilihanMobil = input.nextInt();
                switch (pilihanMobil) {
                    case 1:
                        System.out.println("Pilihan Honda:");
                        System.out.println("1. Jazz (170 jt)");
                        System.out.println("2. Briio (120 jt)");
                        System.out.println("3. Mobilio (170 jt)");
                        int pilihanHonda = input.nextInt();
                        switch (pilihanHonda) {
                            case 1:
                                System.out.println("Harga Jazz: 170 jt");
                                break;
                            case 2:
                                System.out.println("Harga Briio: 120 jt");
                                break;
                            case 3:
                                System.out.println("Harga Mobilio: 170 jt");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Pilihan Suzuki:");
                        System.out.println("1. APV (180 jt)");
                        System.out.println("2. Swift (155 jt)");
                        System.out.println("3. Ertiga (160 jt)");
                        int pilihanSuzuki = input.nextInt();
                        switch (pilihanSuzuki) {
                            case 1:
                                System.out.println("Harga APV: 180 jt");
                                break;
                            case 2:
                                System.out.println("Harga Swift: 155 jt");
                                break;
                            case 3:
                                System.out.println("Harga Ertiga: 160 jt");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                }
                break;
            case 2:
                System.out.println("Pilihan motor:");
                System.out.println("1. Honda");
                System.out.println("2. Yamaha");
                int pilihanMotor = input.nextInt();
                switch (pilihanMotor) {
                    case 1:
                        System.out.println("Pilihan Honda:");
                        System.out.println("1. Vario (15 jt)");
                        System.out.println("2. Supra (12 jt)");
                        int pilihanHondaMotor = input.nextInt();
                        switch (pilihanHondaMotor) {
                            case 1:
                                System.out.println("Harga Vario: 15 jt");
                                break;
                            case 2:
                                System.out.println("Harga Supra: 12 jt");
                                 break;
				                            default:
				                                System.out.println("Pilihan tidak valid");
				                                break;
				                        }
				                        break;
				                    case 2:
				                        System.out.println("Pilihan Yamaha:");
				                        System.out.println("1. Mio (14 jt)");
				                        System.out.println("2. Vixion (20 jt)");
				                        int pilihanYamaha = input.nextInt();
				                        switch (pilihanYamaha) {
				                            case 1:
				                                System.out.println("Harga Mio: 14 jt");
				                                break;
				                            case 2:
				                                System.out.println("Harga Vixion: 20 jt");
				                                break;
				                            default:
				                                System.out.println("Pilihan tidak valid");
				                                break;
				                        }
				                        break;
				                    default:
				                        System.out.println("Pilihan tidak valid");
				                        break;
				                }
				                break;
				            default:
				                System.out.println("Pilihan tidak valid");
				                break;
				        }
			}
}

