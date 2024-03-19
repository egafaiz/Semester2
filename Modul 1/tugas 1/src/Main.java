import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int loop = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Pilih jenis login:");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Masukan nim : ");
                    String number = scanner1.nextLine();
                    if (number.matches("\\d+")) {
                        if (number.length() > 15) {
                            System.out.println("Angka tidak boleh lebih dari 15 karakter");
                        } else if (number.length() < 15) {
                            System.out.println("Angka tidak boleh kurang dari 15 karakter");
                        } else {
                            System.out.println("Login Berhasil");
                        }
                    } else {
                        System.out.println("NIM tidak valid");
                    }
                    loop=1;
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Masukan username : ");
                    String username = scanner2.nextLine();
                    System.out.print("Masukan password : ");
                    String password = scanner2.nextLine();
                    if (username.equals("admin")) {
                        if (password.equals("admin")) {
                            System.out.println("Login Berhasil");
                        } else {
                            System.out.println("Login Gagal");
                        }
                    }
                    loop=1;
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }while (loop==1);
    }
}