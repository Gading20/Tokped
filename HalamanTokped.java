import java.util.Scanner;

public class HalamanTokped {
        private static void PrintTitle() {
            System.out.println("------------------------------");
            System.out.println("    HH  HH  HHHHH");
            System.out.println("    HH  HH  hh  hh");
            System.out.println("    HHHHH   hh  hh");
            System.out.println("    HH  HH  HHHHH");
            System.out.println("------------------------------");
            System.out.println(" TOKO ONLINE - TOKOPEDIA ");
            System.out.println("-------------------------------");
            System.out.println();
        }

        public static void main(String[] args) {
            String Username;
            String Password;
            String NamaLengkap;

            Username ="GADING ILHAM SAPUTRA";
            Password="123456";
            NamaLengkap="GADING ILHAM SAPUTRA";
            Scanner inputUser = new Scanner(System.in);
            PrintTitle();
            System.out.println("Masukan Password");
            Password= inputUser.nextLine();

            if ( Password.equals("123456")) {
                Produk Tokped = new Produk ("","","","");
                char pilihan = 0;
                do {
                    PrintTitle();
                    System.out.println();
                    System.out.println("MENU PRODUK");
                    System.out.println("[1]. Sepatu");
                    System.out.println("[2]. Jaket");
                    System.out.println("[3]. Kemeja");
                    System.out.println("[4]. Sandal");
                    System.out.println("[0]. Batal");
                    System.out.println("Pilihan Anda    : ");
                    pilihan = inputUser.nextLine().charAt(0);
                    System.out.println();
                    switch (pilihan) {
                        case '1' -> {
                            System.out.println("Masukan Keranjang");
                            System.out.println("[1]. Yes");
                            System.out.println("[0]. No ");
                            System.out.println("Pilihan Anda : ");
                            pilihan = inputUser.nextLine().charAt(0);
                            System.out.println();
                            switch (pilihan) {
                                case '1' -> {
                                    String Checkout;
                                    int sepatu;
                                    int Jumlah;
                                    int Total;
                                    System.out.println("Masukah Jumlah Pesanan: ");
                                    Jumlah = inputUser.nextInt();
                                    sepatu= 150000;
                                    Total = sepatu * Jumlah;
                                    System.out.println("Total Bayar : " + Total);

                                    Checkout = "Berhasil";
                                    System.out.println(Checkout);
                                }
                                default -> {
                                }
                            }
                        }
                        default -> {

                        }
                    }
                }while(pilihan!='0');

            }

        }
    }