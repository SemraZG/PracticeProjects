package depoProject;

public class UrunTanimlamaClassi {
    public Urun/*istersem voidde yazabilirim fakat teturn edecegim data typeini yazdim*/urunTanimlama(String urunIsmi,String uretici,String birim) {
        Urun yeniUrun = new Urun();

        // ID alınabilir bir şekilde ayarlanabilir, örneğin rastgele bir ID ataması yapabilirsiniz.

        yeniUrun.urunIsmi = urunIsmi;
        yeniUrun.uretici = uretici;
        yeniUrun.miktar = 0;
        yeniUrun.birim = birim;
        yeniUrun.raf = null; // Başlangıçta raf bilgisi boş olacak
        yeniUrun.id = Id();
        return yeniUrun;
    }

    // Rastgele bir ID üretmek için basit bir yöntem
    private int Id() {
        return (int) (Math.random() * 60);
    }




}//Class

