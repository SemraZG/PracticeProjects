package aracSigortaApp;

import java.util.Scanner;

public class AracSigortaApp {
    public static void main(String[] args) {
        /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */

        //1-uygulamayi baslatmak icin bir method tanimlayalim ve bu methodu cagirarak uygulamayi baslatabilirim
        start();

    }

    private static void start() {
        //2-Kullanicidan bilgileri allaim
        Scanner input=new Scanner(System.in);

        //3-menu gosterelim
        boolean isAgain;//dongu devam etsin mi emtemis mi
        do{
            System.out.println("****Zorunlu Arac Sigortasi Primi hesaplama****");
            System.out.println("Tarife Donemi seciniz: ");
            System.out.println("1==> Haziran 2023");
            System.out.println("2==> Aralik 2023");
            int term=input.nextInt();
            //tarife donemi dogru ise forma devam et aksi halde hatali giris uyarisi verelim ve yeniden form gosterelim
            if (term==1 || term==2){
                //4-arac objesi olusturalim--once arac classi olusturduk
                Arac arac=new Arac();//default oalrak parametresiz constructor i kullandk
                System.out.println("Arac tipini giriniz");
                System.out.println("otomobil, kamyon, otobus, motosiklet");
                String type=input.next().trim();

                arac.setType(type);
                arac.setPrim(term);

                if (arac.getPrim()>0){
                    //sonucu goruntule
                    System.out.println("Arac tipi: "+arac.getType());
                    System.out.println("Tarife Donemi: "+(term==1 ? "Haziran 2023" : "Aralik 2023"));
                    System.out.println("Aracinizin ilgili donem zorunlu sigorta primi: "+ arac.getPrim());
                    System.out.println("----------------------------------------------------------------");
                }else{
                    System.out.println("Hesaplama basarisiz, tekrar deneyiniz");
                }

                System.out.println("Yeni islem icin 1, cikis icin 0 seciniz.");
                int select=input.nextInt();
                isAgain=select!=0 ? true : false;


            }else{
                System.out.println("Hatali Giris, yeniden deneyiniz!");
                isAgain=true;
            }

            System.out.println();
        }while (isAgain);
        System.out.println("Iyi gunler dileriz..");
    }
}
