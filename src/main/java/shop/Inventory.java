package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    List<Flower> flowers = new ArrayList<>();

    public Inventory(){
            flowers.add(new Flower(FlowerColor.WHITE, 20, FlowerType.CHAMOMILE));
            flowers.add(new Flower(FlowerColor.RED, 60, FlowerType.ROSE));
            flowers.add(new Flower(FlowerColor.BLUE, 80, FlowerType.TULIP));
        }

    public List<Flower> search(Criteria criteria) {
        return flowers.stream()
                .filter(f -> f.getColor().equals(criteria.getColor().toString()))
                .filter(f -> f.getType().equals(criteria.getType()))
                .filter(f -> f.getPrice() <= criteria.getMaxPrice())
                .collect(Collectors.toList());
    }
}

