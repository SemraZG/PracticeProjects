package bankProject;

import java.util.Scanner;

public class BankaApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secim;
        do {
            System.out.println("Bankamiza hos geldiniz\n"+
                    "1.Yeni hesap ac\n"+
                    "2.Musteri olarak giris yap\n"+
                    "3.Yonetici olarak giris yap\n" +
                    "4.Cikis yap\n"+
                    "Seciminizi giriniz: ");
            secim=input.nextInt();

            switch (secim){
                case 1:
                    BankaHesabi.yeniHesapAc(input);
                    break;
                case 2:
                    MusteriMenu.musteriGirisi(input);
                    break;
                case 3:
                    YoneticiMenu.yoneticiGirisi(input);
                    break;
                case 4:
                    System.out.println("Cikis yapiliyor");
                    break;
                default:
                    System.out.println("Hatali bir secim yaptiniz\n"+
                            "Lutfen gecerli bir secim yapiniz");
                    break;
            }
        }while (secim!=4);
    }


}
