import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] arrayString;
//        arrayString = new String[3];
//        arrayString[0] = "Eko";
//        arrayString[1] = "Kurniawan";
//        arrayString[2] = "Khannedy";
//
//        System.out.printf(arrayString[1]);

//        var nilai = 60;
//        var absen = 80;
//
//        if (nilai >= 75 && absen >= 75) {
//            System.out.println("Anda Lulus");
//        } else {
//            System.out.println("Anda Tidak Lulus");
//        }
//
//        if (nilai >= 80 && absen >= 80) {
//            System.out.println("Nilai Anda A");
//        } else if (nilai >= 70 && absen >= 70) {
//            System.out.println("Nilai Anda B");
//        } else if (nilai >= 60 && absen >= 60) {
//            System.out.println("Nilai Anda C");
//        } else if (nilai >= 50 && absen >= 50) {
//            System.out.println("Nilai Anda D");
//        } else {
//            System.out.println("Nilai Anda E");
//        }
//        var nilai = "C";
//        String ucapan = switch (nilai) {
//            case "A":
//                yield "Wow Anda Lulus Dengan Baik";
//            case "B", "C":
//                yield "Anda Lulus";
//            case "D":
//                yield "Anda Tidak Lulus";
//            default:
//                yield "Mungkin Anda Salah Jurusan";
//        };
//        System.out.println(ucapan);

//    for (var counter = 1; counter <= 10; counter++) {
//        System.out.println("Perulangan Ke-" + counter);
//    }

//        var counter = 100;
//
//        do {
//            System.out.println("Perulangan Ke-" + counter);
//            counter++;
//        } while (counter <= 10);

        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.println("Masukkan angka 1 sampai 10: ");
            userNumber = scanner.nextInt();
        } while (userNumber < 1 || userNumber > 10);

        System.out.println("Yang kamu input: " + userNumber);

        //Closing the scanner to prevent resource leak
        scanner.close();

    }
    }