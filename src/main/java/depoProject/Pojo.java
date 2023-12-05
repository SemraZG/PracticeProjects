package depoProject;

public class Pojo {
    /* 1-) burada oncelikle urunun tanimlamasi  yapilir.
    id
    urunIsmi
    uretici
    miktar
    birim ve
    raf (6 adet fields mevcut)
     */

    public int id;
    public String urunIsmi;
    private int miktar;
    private String birim;
    public String uretici;
    protected int raf;

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = String.valueOf(birim);
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +

                ", birim='" + birim + '\'' +
                ", uretici='" + uretici + '\'' +

                '}';
    }
}
