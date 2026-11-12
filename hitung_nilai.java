import java.util.Scanner;

public class hitung_nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0 - 100): ");
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
        input.close();
    }
}
