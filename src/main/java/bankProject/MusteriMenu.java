package bankProject;

import java.util.Scanner;

public class MusteriMenu {
    static void musteriGirisi(Scanner input){
        System.out.println("Hesap numaranizi giriniz");
        input.nextLine();
        String girisHesapNumarasi= input.nextLine();

        System.out.println("Sifrenizi giriniz");
        String girissifresi= input.nextLine();

        BankaHesabi mevcutHesap=BankaHesabi.hesapBul(girisHesapNumarasi);
        if (mevcutHesap!=null && mevcutHesap.getSifre().equals(girissifresi)){
            //giris yapildi musteri menuusnu goruntulensin
            musteriMenusu(input, mevcutHesap);
        }else{
            System.out.println("Hesap bulunammadi veya gecersiz sifre\n"+
                    "Lutfen tekrar deneyiniz");
        }
    }

    private static void musteriMenusu(Scanner input, BankaHesabi mevcutHesap) {
        int secim;
        do {
            System.out.println("Giris yapildi\n"+
                    "Hesap no: "+mevcutHesap.getHesapNumarasi()+ "\n"+
                    "1.Para yatir\n"+
                    "2.Para cek\n"+
                    "3.Bakiye sorgula\n"+
                    "4.Para transferi\n"+
                    "5.Yeni hesap ac\n"+
                    "6.Cikis yap");
            secim=input.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Yatirmak istediginiz miktari giriniz");
                    double yatirilacakMiktar= input.nextDouble();
                    mevcutHesap.paraYatir(yatirilacakMiktar);
                    break;
                case 2:
                    System.out.println("Cekmek istediginiz miktari giriniz");
                    double cekilecekMiktar=input.nextDouble();
                    mevcutHesap.paraCek(cekilecekMiktar);
                    break;
                case 3:
                    mevcutHesap.hesapBilgileriniGoruntule();
                    break;
                case 4:
                    BankaHesabi.paraTransferi(input, mevcutHesap);
                    break;
                case 5:
                    BankaHesabi.yeniHesapAc(input);
                    break;
                case 6:
                    System.out.println("Cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Gecersiz secenek");
                    break;
            }
            System.out.println("Yeni bir islem yapmak ister misiniuz?(Evet-->1, Hayir-->2");
            int devamSecimi=input.nextInt();
            if (devamSecimi!=1){
                break;
            }
        }while (secim!=6);
    }


}
