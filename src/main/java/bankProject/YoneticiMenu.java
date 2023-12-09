package bankProject;

import java.util.Scanner;

public class YoneticiMenu {
    public static void yoneticiGirisi(Scanner input){
        int yoneticiSecimi;
        do {
            System.out.println("Yonetici olarak giris yaptiniz\n"+
                    "1.Musteri sayiis\n"+
                    "2. Tum musteri iismleri\n"+
                    "3.Bankadaki toplam nakit\n"+
                    "4.Cikis yap\n"+
                    "Seciminizi giriniz");
            yoneticiSecimi= input.nextInt();

            switch (yoneticiSecimi){
                case 1:
                    System.out.println(BankaHesabi.getTumHesaplar().size());
                    break;
                case 2:
                    for (BankaHesabi hesap: BankaHesabi.getTumHesaplar()) {
                        System.out.println(hesap.getHesapSahibiAdi());
                    }
                    break;
                case 3:
                    double toplamNakit=0;
                    for (BankaHesabi hesap: BankaHesabi.getTumHesaplar()){
                       toplamNakit+= hesap.getBakiye();
                    }
                    System.out.println("toplamNakit = " + toplamNakit);
                    break;
                case 4:
                    System.out.println("Cikis yapiliyor");
                    break;
                default:
                    System.out.println("Gecersiz secenek");
                    break;
            }

            System.out.println("Yeni bir islem yapmak ister misniz?(Evet--<1, Hayir-->2");
            int devamSecimi= input.nextInt();
            if (devamSecimi!=1){
                break;
            }
        }while (yoneticiSecimi!=4);
    }
}
