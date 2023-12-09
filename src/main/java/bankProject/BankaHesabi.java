package bankProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankaHesabi {

    private String hesapSahibiAdi;
    private String sifre;
    private double bakiye;
    private String hesapNumarasi;
    static int hesapSayaci=1;
    private static List<BankaHesabi> tumHesaplar=new ArrayList<>();

    public static List<BankaHesabi> getTumHesaplar() {
        return tumHesaplar;
    }

    public String getHesapSahibiAdi() {
        return hesapSahibiAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public BankaHesabi(String hesapSahibiAdi, String sifre, double bakiye, String hesapNumarasi) {
        this.hesapSahibiAdi = hesapSahibiAdi;
        this.sifre = sifre;
        this.bakiye = bakiye;
        this.hesapNumarasi = hesapNumarasi;
    }





    public static void yeniHesapAc(Scanner input) {
        System.out.println("Kullanici ad-soyad giriniz");
        input.nextLine();
        String kullaniciAdi=input.nextLine();
        System.out.println("Sifre belirleyiniz");
        String sifre= input.next();
        System.out.println("Baslangic bakiyesi yukleyiniz");
        double baslangicBakiye= input.nextDouble();

        String hesapNumarasi=hesapSayaci+".Zugurt";
        hesapSayaci++;

        BankaHesabi hesap=new BankaHesabi(kullaniciAdi, sifre, baslangicBakiye, hesapNumarasi);
        tumHesaplar.add(hesap);
        System.out.println("Hesabiniz basariyla olusturuldu\n"+
                "Hesap numaraniz: "+hesapNumarasi);
//        System.out.println(hesap.getHesapSahibiAdi());
//        System.out.println(hesap.getHesapNumarasi());
//        System.out.println(hesap.getBakiye());
    }

    void paraYatir(double miktar){
        if (miktar>0){
            bakiye+=miktar;
            System.out.println("Isleminiz basariyla gerceklestirildi\n"+
                    "Guncel bakiyeniz: "+bakiye);
        }else{
            System.out.println("Gecersiz bir miktar girdiniz.\n"+
                    "Lutfen gecerli bir miktar giriniz.");
        }
    }

    void paraCek(double miktar){
        if (bakiye>=miktar){
            bakiye-=miktar;
            System.out.println("Isleminiz basariyla gerceklestirildi\n"+
                    "Guncel bakiyeniz: "+bakiye);
        }else{
            System.out.println("Gecersiz bir miktar girdiniz.\n"+
                    "Lutfen gecerli bir miktar giriniz.");
        }
    }

    void bakiyeSorgulama(){
        System.out.println("Hesap Sahibi: "+hesapSahibiAdi);
        System.out.println("Hesap numaraniz: "+hesapNumarasi);
        System.out.println("Bakiyeniz: "+bakiye);
    }

    void hesapBilgileriniGoruntule(){
        System.out.println("Hesap Sahibi :"+hesapSahibiAdi);
        System.out.println("Hesap No :"+hesapNumarasi);
        System.out.println("Bakiye :"+bakiye);
    }


    public static BankaHesabi hesapBul(String hesapNumarasi){
        for (BankaHesabi hesap: tumHesaplar){//hesap==fordaki w
           if (hesap.getHesapNumarasi().equals(hesapNumarasi)){
               return hesap;
           }
        }
        return null;
    }


    public static void paraTransferi(Scanner input, BankaHesabi gonderenHesap){
        System.out.println("Transfer etmek istediginiz hesap numarasini giriniz");
        input.nextLine();
        String hedefHesapNo=input.nextLine();

        BankaHesabi hedefHesap=hesapBul(hedefHesapNo);
        if (hedefHesap!=null){
            System.out.println("Transfer etmek istediginiz miltari giirniz");
            double transferMiktari=input.nextDouble();

            if (gonderenHesap.getBakiye()>transferMiktari){
                gonderenHesap.paraCek(transferMiktari);
                hedefHesap.setBakiye(hedefHesap.getBakiye()+transferMiktari);

                System.out.println("Transfer tamamlandi");
            }else{
                System.out.println("Yetersiz bakiye tekrar deneyiniz");
        }
     }else{
            System.out.println("Hesap numarasi bulunamadi");
        }
}


}
