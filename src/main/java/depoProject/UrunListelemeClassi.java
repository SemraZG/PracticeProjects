package depoProject;

import java.util.Arrays;

public class UrunListelemeClassi {
    public void urunListele(Urun[] urunler) {
        for (Urun urun : urunler) {
            System.out.println("Ürün ID: " + urun.id);
            System.out.println("Ürün İsmi: " + urun.urunIsmi);
            System.out.println("Üretici: " + urun.uretici);
            System.out.println("Miktar: " + (urun.miktar >= 0 ? urun.miktar : "Default Miktar"));
            System.out.println("Birim: " + urun.birim);
            System.out.println("Raflar: " + (urun.raf != null ? Arrays.toString(urun.raf) : "Default Raf"));
            System.out.println("---------------------------");
        }
    }
}
