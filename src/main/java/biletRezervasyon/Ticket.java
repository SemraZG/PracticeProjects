package biletRezervasyon;

public class Ticket {
    //4-mesafe(KM), koltuk no, fiyat, yolculuk tipi
    public double distance;
    public String seatNo;
    public int typeNo;
    private double price;//verilen bilgilere gore hesaplanacak


    //5-bilet fiyatini hesaplayalim
    public void setPrice(int age){
        double total=0;
        int seat=Integer.parseInt(this.seatNo);
        switch (this.typeNo){
            case 1://tek yon
                if (seat%3==0){
                    total=this.distance*1.2;
                }else{
                    total=this.distance*1;
                }
                System.out.println("Toplam fiyat: "+total);
                break;
            case 2://cift yon
                if (seat%3==0){
                    total=this.distance*2.4;
                }else{
                    total=this.distance*2;
                }
                System.out.println("Indirimsiz Toplam fiyat: "+total);
                total=total*0.8;
                System.out.println("Indirimli Toplam fiyat: "+total);
                break;
        }

        if (age<12){//yas indirimi tek yon cift yonden bagimsiz oldugu icin ayri bir ifle kontrolm ettik
            total=total*0.5;
            System.out.println("Yas indirimli tutar:"+ total);
        }else if(age>65){
            total=total*0.7;
            System.out.println("Yas indirimli tutar:"+ total);
        }

        this.price=total;
    }


    //6-bileti yazdiralim
    public void printTicket(Bus bus, String name){
        System.out.println("*".repeat(42));
        System.out.println("----Bilet Detayi----");
        System.out.println("Sayin: "+name);
        System.out.println("Plaka: "+bus.numberPlate);
        System.out.println("Mesafe: "+this.distance);
        System.out.println("Yolculuk tipi: "+(this.typeNo==1 ? "Tek Yon" : "Gidis-Donus"));
        System.out.println("Koltuk no: "+this.seatNo);
        System.out.println("Toplam tutar: "+this.price);
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));
    }
}
