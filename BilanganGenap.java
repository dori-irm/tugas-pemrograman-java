import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK / NIM: ");
        long nik = input.nextLong();

        if (nik % 2 != 0) {
            System.out.println("NIK Ganjil -> Menggunakan metode FOR:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("NIK Genap -> Menggunakan metode WHILE:");
            int i = 1;
            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }

        System.out.println();
        input.close();
    }
}
