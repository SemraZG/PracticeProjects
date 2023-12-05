package aracSigortaApp;

import java.util.Scanner;

public class Arac {
    private String type;//aracin type ini kullanicidan alicaz
    private int prim;//tarife donemine gore biz hesaplayacagiz

    //getter ve setter ile private yaparak sakladigim datlara ulasilabilir yapiyorum

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrim() {
        return prim;
    }

    public void setPrim(int term) {//prim deferini disaridan degistirilmesini istemeyiz, bu yuzden term bilgisi istedik parametre olrak
        //aracin tipi ve tarife donemin egore
        switch (this.type){
            case "otomobil":
                this.prim= term==1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim= term==1 ? 3000 : 3500;
                break;
            case "otobus":
                countBusPrim(term);
                break;
            case "motosiklet":
                this.prim= term==1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatali giris!");
                this.prim=0;
                break;
        }
    }

    private void countBusPrim(int term) {
        Scanner input=new Scanner(System.in);
        System.out.println("Otobus tipini seciniz: ");
        System.out.println("1. (18-30) Koltuk arasi");
        System.out.println("2. 31 Koltuk ve uzeri");
        int busType=input.nextInt();
        switch (busType){
            case 1://18-30 arasi koltuk
               this.prim=term==1 ? 4000 : 4500;//term 1 ==haziran donemi, degilse aralik demek
               break;
            case 2://31 koltuk uzeri
                this.prim= term==1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatali giris!");
                this.prim=0;
                break;
        }
    }
}
