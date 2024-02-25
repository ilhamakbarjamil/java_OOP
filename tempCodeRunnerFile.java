import java.util.Scanner;

public class codelab{
    public static void main(String[] args) {
        String nama;
        String gender;
        String lahirStr;
        int lahir;
        Scanner Tampil = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = Tampil.nextLine();
        
        System.out.print("Jenis Kelamin (P/L): ");
        gender = Tampil.nextLine();

        System.out.print("Tanggal Lahir: ");
        lahirStr = Tampil.nextLine();
        lahir = Integer.parseInt(lahirStr);

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Tanggal Lahir : " + lahir);
    }
}
