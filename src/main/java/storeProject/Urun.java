package storeProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Urun {
     /* 1-) burada oncelikle urunun tanimlamasi  yapilir.
    id
    urunIsmi
    uretici
    miktar
    birim ve
    raf (6 adet fields mevcut)
     */
    private int id;
    public String urunIsmi;
    public String uretici;
    private int miktar=0;
    public String birim;
    public String raf="-";

    public int getId() {
        return id;
    }
    int sayac=1000;

    public void setId(int id) {
        this.id = ++sayac;

    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getRaf() {
        return raf;
    }

    @Override
    public String toString() {
        return "Urun{" +

                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }

    Map<Integer, Urun> tumUrunler=new HashMap<>();

    public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf, Map<Integer, Urun> tumUrunler) {
        this.id = sayac++;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
        this.tumUrunler = tumUrunler;
    }

    public Urun() {
    }
}
