import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        String jeneng;
        String gender;
        String jenisKelamin;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        jeneng = scanner.nextLine();

        System.out.print("Jenis Kelamin (P/L): ");
        gender = scanner.nextLine();

        if (gender.equalsIgnoreCase("p")) {
            jenisKelamin = "perempuan";
        } else if (gender.equalsIgnoreCase("l")) {
            jenisKelamin = "laki-laki";
        } else {
            jenisKelamin = "disembunyikan karena bersifat rahasia";
        }

        
        System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate hariIni = LocalDate.now();
        int umur = Period.between(tanggalLahir, hariIni).getYears();

        System.out.println("\nNama: " + jeneng);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
