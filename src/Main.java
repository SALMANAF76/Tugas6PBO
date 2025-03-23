// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = null;

        System.out.println("Pilih laptop yang ingin digunakan:");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        switch (choice) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak valid. Keluar.");
                System.exit(0);
        }

        LaptopUser user = new LaptopUser(laptop);

        while (true) {
            System.out.println("\nMasukkan perintah (ON, OFF, UP, DOWN, EXIT): ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
            }
        }
    }
}
