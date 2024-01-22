import java.util.Scanner;

public class ATM {
    private static int saldo = 0;
    private static final String Nomor_Akun = "211230058";
    private static final String PIN = "1801";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        autentikasi(scanner);
//Menu
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    tarikTunai(scanner);
                    break;
                case 4:
                    keluar();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);

        scanner.close();
    }

    private static void autentikasi(Scanner scanner) {
        System.out.println("Selamat datang di ATM");
        System.out.print("Masukkan nomor akun Anda: ");
        String nomorAkun = scanner.next();

        System.out.print("Masukkan PIN Anda: ");
        String pin = scanner.next();

        if (nomorAkun.equals(Nomor_Akun) && pin.equals(PIN)) {
            System.out.println("Autentikasi berhasil.");
        } else {
            System.out.println("Autentikasi gagal. Program akan keluar.");
            System.exit(0);
        }
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");
    }

    private static void cekSaldo() {
        System.out.println("Saldo Anda saat ini: Rp " + saldo);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Masukkan jumlah deposit: Rp ");
        int jumlahDeposit = scanner.nextInt();
        saldo += jumlahDeposit;
        System.out.println("Deposit Rp " + jumlahDeposit + " berhasil. Saldo Anda sekarang: Rp " + saldo);
    }

    private static void tarikTunai(Scanner scanner) {
        System.out.print("Masukkan jumlah penarikan: Rp ");
        int jumlahPenarikan = scanner.nextInt();
        if (jumlahPenarikan > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan tersebut.");
        } else {
            saldo -= jumlahPenarikan;
            System.out.println("Penarikan Rp " + jumlahPenarikan + " berhasil. Saldo Anda sekarang: Rp " + saldo);
        }
    }

    private static void keluar() {
        System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
        System.exit(0);
    }
}

