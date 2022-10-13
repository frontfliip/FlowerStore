package shop;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> packs = new ArrayList<>();
    public void add(FlowerPack flowers){
        this.packs.add(flowers);
    }
    public double getPrice(){
        double price = 0;
        for (int i = 0; i < packs.size(); i++) {
            price += (packs.get(i).getFlower().getPrice() * packs.get(i).getQuantity());
        }
        return price;
    }

}
