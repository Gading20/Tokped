import java.util.ArrayList;
import java.util.Scanner;

public class KeranjangBelanja {
    public static void main(String[] args) {
        ArrayList<Produk> DaftarProduk = new ArrayList<Produk>();
        for (int i=0;i<1;i++){
            Produk Akunku =new Produk();

            Scanner inputdetail = new Scanner(System.in);

            System.out.println("Anda Telah belanja Sepatu: ");
            Akunku.Sepatu= inputdetail.nextLine();

            System.out.println("Anda Telah Belanja Jaket: ");
            Akunku.Jaket = inputdetail.nextLine();

            System.out.println("Anda Telah Belanja Kemeja : ");
            Akunku.Kemeja= inputdetail.nextLine();

            System.out.println("Anda Telah Belanja Sandal : ");
            Akunku.Sandal = inputdetail.nextLine();

            System.out.println("-------------------------------------");
        }
    }
}
