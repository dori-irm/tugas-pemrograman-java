import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==========================================");
            System.out.println("   MENU PROGRAM JAVA - DORI IRMAWAN");
            System.out.println("   NIM: 2510075 (Ganjil)");
            System.out.println("==========================================");
            System.out.println("1. Tampilkan Bilangan Genap (1 - 100)");
            System.out.println("2. Hitung Luas Persegi Panjang (p=5, l=8)");
            System.out.println("3. Hitung Grade Nilai (If-Else)");
            System.out.println("4. Keluar");
            System.out.println("==========================================");
            System.out.print("Pilih menu (1-4): ");

            while (!input.hasNextInt()) {
                System.out.print("Input harus berupa angka (1-4): ");
                input.next();
            }
            pilihan = input.nextInt();

            System.out.println();

            switch (pilihan) {
                case 1:
                    tampilkanBilanganGenap();
                    break;
                case 2:
                    hitungLuasPersegiPanjang();
                    break;
                case 3:
                    hitungGradeNilai(input);
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        } while (pilihan != 4);

        input.close();
    }

    // 1. Bilangan Genap 1-100 dengan metode For (NIM Ganjil)
    public static void tampilkanBilanganGenap() {
        System.out.println("--- 1. Bilangan Genap (1 - 100) ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 2. Luas Persegi Panjang (panjang = 5, lebar = 8)
    public static void hitungLuasPersegiPanjang() {
        System.out.println("--- 2. Luas Persegi Panjang ---");
        int panjang = 5;
        int lebar = 8;
        int luas = panjang * lebar;

        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar   = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    // 3. Hitung Grade Nilai dengan If-Else
    public static void hitungGradeNilai(Scanner input) {
        System.out.println("--- 3. Hitung Grade Nilai ---");
        System.out.print("Masukkan nilai (0 - 100): ");

        while (!input.hasNextInt()) {
            System.out.print("Input harus berupa angka (0 - 100): ");
            input.next();
        }
        int nilai = input.nextInt();
        String grade;

        if (nilai >= 90 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 81 && nilai < 90) {
            grade = "B";
        } else if (nilai >= 71 && nilai <= 80) {
            grade = "C";
        } else if (nilai >= 61 && nilai <= 70) {
            grade = "D";
        } else if (nilai >= 0 && nilai <= 60) {
            grade = "E";
        } else {
            grade = "Nilai tidak valid (masukkan angka 0 - 100)";
        }

        System.out.println("Grade = " + grade);
    }
}
