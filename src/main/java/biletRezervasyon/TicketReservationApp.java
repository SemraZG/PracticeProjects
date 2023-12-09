package biletRezervasyon;

import java.util.Scanner;

public class TicketReservationApp {
    /*
Project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

    1- Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
    2- Kullanıcıdan     mesafe (KM),
                        yolcu adı, yaşı ,
                        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                        ve koltuk no bilgilerini alınır.
             NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
                  Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                  Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

    3-Fiyat hesaplama kuralları:
       -Mesafe başına ücret:
                  Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
       -Tekli Koltuk ücreti:
                  Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
       -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
                   i)-Çift Yön indirimi:
                               "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
                   ii)-Yaş indirimi:
                                Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
                               Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

 */

    public void start(){
        //1-bilet rezervasyonu icin bilet ve otobus objesine ihtiyacimiz var
        Bus bus=new Bus("34 PL 212");
        Ticket ticket=new Ticket();

        Scanner input=new Scanner(System.in);
        int select;//cikic icin 0'i seciniz(select==0)
        do {
            //7-Kullanicidan bilgileri alalim
            System.out.println("*    Bilet Rezervasyon Sistemine Hosgeldiniz   *");
            System.out.println("Ad-Soyad giriniz: ");
            String name= input.nextLine();

            System.out.println("Yasinizi giriniz");
            int age= input.nextInt();

            System.out.println("Gidilecek mesafe bilgiisni KM olarak giriniz");
            double distance= input.nextDouble();

            System.out.println("Yolculuk tipini seciniz: ");
            System.out.println("1-Tek Yon");
            System.out.println("2-Gidis-Donus");
            int type= input.nextInt();

            System.out.println("Koltuk no seciniz: ");
            System.out.println("Tekli koltuk ucreti %20 daha fazladir");
            System.out.println(bus.seats);//otobusteki mevcut koltuk nolari listeleyecek
            String seat= input.next();

            //secilen koltuk rezerve edilmis mi, koltuk no listede var mi ile bunu kontrol edebiliriz
            boolean isReserved=!bus.seats.contains(seat);
            if(isReserved){
                System.out.println("Secilen koltuk otobuste bulunmamaktadir ya da reserve edilmistir");
            }
            //girilen degerler gecerli mi
            if (age>0 && distance>0 && (type==1 || type==2) && !isReserved){
                //hersey dogruysa bileti doldurucaz
                ticket.distance=distance;
                ticket.typeNo=type;
                ticket.seatNo=seat;
                ticket.setPrice(age);
                //bu koltugu reserveden sonra otobus koltuk listesinde kaldirmamiz gerekiyor
                bus.seats.remove(seat);
                //bileti yazdiralim
                ticket.printTicket(bus, name);//yazdirmak iicn ayri bir method olusturmustuk
            }else{
                System.out.println("Gecersiz giris yaptiniz");
            }
            System.out.println("Yeni islem icin bir sayi giriniz, cikis icin 0 giriniz");
            select= input.nextInt();
            input.nextLine();

        }while (select!=0);
        System.out.println("Iyi gunler dileriz...");
    }
}
