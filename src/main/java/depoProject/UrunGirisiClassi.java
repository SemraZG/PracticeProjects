package depoProject;

import java.util.Arrays;
import java.util.Scanner;

public class UrunGirisiClassi {
    public void urunGirisi(Urun urun) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün ID: " + urun.id);
        System.out.println("Ürün İsmi: " + urun.urunIsmi);
        System.out.println("Üretici: " + urun.uretici);
        System.out.println("Miktar: " + urun.miktar);
        System.out.println("Birim: " + urun.birim);
        System.out.println("Raflar: " + (urun.raf != null ? Arrays.toString(urun.raf) : "Bos Raf"));



        System.out.print("Giriş yapmak istediğiniz miktarı girin: ");
        int girisMiktari = scanner.nextInt();

        if (girisMiktari >= 0) {
            urun.miktar += girisMiktari;
            System.out.println("Giriş başarıyla gerçekleştirildi. Yeni miktar: " + urun.miktar);
        } else {
            System.out.println("Geçersiz giriş miktarı.");
        }
    }

}

