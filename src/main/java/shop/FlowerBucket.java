package shop;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> packs = new ArrayList<>();
    public void add(FlowerPack flowers){
        this.packs.add(flowers);
    }
    public double getPrice(){
        return packs.stream().mapToDouble(FlowerPack::calcPrice).sum();
    }

}
