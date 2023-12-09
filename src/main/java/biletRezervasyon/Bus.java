package biletRezervasyon;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2-plaka ve koltuk numarasi gerekli

    public String numberPlate;
    public List<String> seats=new ArrayList<>();

    //3-otobus(Bus) objesi olusturuldugunda numberPlate ve seats ler set edilsin

    public Bus(String plate) {
        this.numberPlate = plate;
        for (int i=1; i<33; i++){
            this.seats.add(String.valueOf(i));//veya---this.seats.add(i+"")
        }

    }
}
