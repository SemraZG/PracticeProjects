package depoProject;

import java.util.Arrays;
import java.util.Scanner;

public class UrunRafaKoymaClassi {
    public void urunuRafaKoy(Urun[] urunler) {

        Scanner scanner = new Scanner(System.in);

        // Ürünleri listele
        System.out.println("----- Ürün Listesi -----");
        for (Urun urun : urunler) {
            System.out.println("Ürün ID: " + urun.id);
            System.out.println("Ürün İsmi: " + urun.urunIsmi);
            System.out.println("---------------------------");
        }

        // Kullanıcıdan ürün seçmesini iste
        System.out.print("Rafa koymak istediğiniz ürünün ID'sini girin: ");
        int secilenId = scanner.nextInt();

        // Seçilen ID'ye sahip ürünü bul
        Urun secilenUrun = null;
        for (Urun urun : urunler) {
            if (urun.id == secilenId) {
                secilenUrun = urun;
                break;
            }
        }

        secilenUrun.raf = new String[]{"raf1", "raf2", "raf3", "raf4", "raf5", "raf6"};

        // Seçilen ürünü rafa koy
        if (secilenUrun != null) {

            if (secilenId / 10 == 0){

                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};
                System.out.println(Arrays.toString(secilenUrun.raf));

            }

            if (secilenId / 10 == 1){
                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};

            }

            if (secilenId / 10 == 2){
                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};

            }

            if (secilenId / 10 == 3){
                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};

            }

            if (secilenId / 10 == 4){
                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};

            }

            if (secilenId / 10 == 5){
                secilenUrun.raf = new String[]{secilenUrun.raf[secilenId / 10]};

            }





            System.out.println("Urun Rafa koyuldu Raf numarasi  : " + secilenUrun.raf  );

        } else {
            System.out.println("Belirtilen ID'ye sahip ürün bulunamadı.");
        }
    }


}



