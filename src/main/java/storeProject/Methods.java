package storeProject;

import java.util.HashMap;
import java.util.Map;

public class Methods {
  //urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist

    public static void urunTanimlama(String urunIsmi, String uretici, String birim){
        Urun urun=new Urun();
        urun.urunIsmi=urunIsmi;
        urun.uretici=uretici;
        urun.birim=birim;
        urun.getMiktar();
        urun.getRaf();

        urun.tumUrunler.put(urun.getId(), urun);
        System.out.println(urun.tumUrunler);
    }

//    public void urunGirisi(int id){
//        Urun urun=new Urun();
//        if (urun.tumUrunler.containsKey(id)){
//            System.out.println("Girilen id'ye ait urun zaten girilmistir");
//        }else{
//            urun.setId()
//        }
//    }


}
