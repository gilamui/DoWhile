import java.util.Scanner;

public class PembelianAlattulis {
    public static void main(String[] args) {
        int pilihan, jumlah=0;
        double harga=0,total,temporary=0;
        String ulang;
        do {
        Scanner s = new Scanner(System.in);
        System.out.println("==List Alat Tulis==");
        System.out.println("1.Buku      - 4.000\n2.Pensil    - 2.500\n3.Penghapus - 1.000\n4.Penggaris - 2.500");
        System.out.println("\n==Pilih item(1/2/3/4)==");
        pilihan = s.nextInt();
        System.out.println("Jumlah beli:");
        jumlah = s.nextInt();

        switch (pilihan) {
            case 1:
                harga =4000;
                break;
            case 2:
                harga=2500;
                break;
            case 3:
                harga=1000;
                break;
            case 4:
                harga=2500;
                break;
        
            default:
                System.out.println("Inputan Salah!");
                break;
        }
        total=jumlah*harga;
        temporary+=total;
        System.out.println("Apakah ingin membeli lagi?\n(y/n)");
        ulang = s.next();

        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("Total yang dibayarkan "+temporary);
    }
}
