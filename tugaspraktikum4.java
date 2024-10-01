import java.util.*;

public class tugaspraktikum4 {
private static final Scanner scan = new Scanner (System.in);
       public static void main(String[] args) {
            /*int maksBil = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();

            for (int i = 0; i <= maksBil; i++) {
                if (a == b ) {
                    if ( i % a == 0) {
                        System.out.println("CakBum");
                    } else {
                        System.out.println(i);
                    }
                } else {
                    if (i % a == 0 && i % b == 0){
                        System.out.println("BumCak");
                } else if (i % a == 0) {
                    System.out.println("Bum");
                } else if (i % b == 0) {
                    System.out.println("Cak");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}*/

            //Daftar Makanan
            System.out.println("SELAMAT DATANG DI DAMAI'S EATERY");
            System.out.println("LIST MAKANAN:");
            System.out.println("1. Nasi Lalapan 13.000");
            System.out.println("2. Mi ayam 9.000");
            System.out.println("3. Nasi Campur 10.000");
            System.out.println("4. Nasi Pecel 10.000");
            System.out.println("0. Keluar");

            Scanner input = new Scanner(System.in);
            int totalBayar = 0;
            int totalMakan = 0;
            int totalMinum = 0;

            while (true) {

                System.out.println("Pilih order dan masukkan jumlah:");
                int orderMakan = input.nextInt();
                if (orderMakan == 0) {
                    break;
                }
    
                int jumlahMakan = input.nextInt();
    
                // Total Pembayaran Makanan
                switch (orderMakan) {
                    case 1:
                        totalMakan = totalMakan + 13000 * jumlahMakan;
                        break;
                    case 2:
                        totalMakan = totalMakan + 9000 * jumlahMakan;
                        break;
                    case 3:
                        totalMakan = totalMakan + 10000 * jumlahMakan;
                        break;
                    case 4:
                        totalMakan = totalMakan + 10000 * jumlahMakan;
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                        break;
                }
            }
    
            // Daftar Minuman
            System.out.println("LIST MINUMAN:");
            System.out.println("1. Teh 5.000");
            System.out.println("2. Jeruk 6.000");
            System.out.println("3. Susu 8.000");
            System.out.println("0. Keluar");
    
            while (true) {
                System.out.println("Pilih order dan masukkan jumlah: ");
                int orderMinum = input.nextInt();
    
                if (orderMinum == 0) {
                    break;
                }
    
                int jumlahMinum = input.nextInt();
    
                // Total Pembayaran Minuman
                switch (orderMinum) {
                    case 1:
                        totalMinum = totalMinum + 5000 * jumlahMinum;
                        break;
                    case 2:
                        totalMinum = totalMinum + 6000 * jumlahMinum;
                        break;
                    case 3:
                        totalMinum = totalMinum + 8000 * jumlahMinum;
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                        break;
                }
            }
    
            // Total Bayar
            totalBayar = totalMakan + totalMinum;
            System.out.println("Total belanja: " + totalBayar);
    
            // Proses Pembayaran
            while (true) {
                System.out.print("Masukkan uang untuk membayar: ");
                int uangBayar = input.nextInt();

            //Memeriksa jumlah uang, cukup atau tidak
            while (uangBayar < totalBayar) {
                int kekurangan = totalBayar - uangBayar;
                System.out.println("Uang yang dimasukkan kurang " + (totalBayar - uangBayar) + ". Masukkan uang lagi:");
                uangBayar += input.nextInt();
            }

            // Menghitung kembalian
            int kembalian = uangBayar - totalBayar;
            if (uangBayar >= totalBayar) {
                if (kembalian > 0) {
                    System.out.println("Kembalian: " + (uangBayar - totalBayar));
                }

                System.out.println("TERIMA KASIH TELAH BERBELANJA DI DAMAI'S EATERY");
                break;
            }
        }
    }
}