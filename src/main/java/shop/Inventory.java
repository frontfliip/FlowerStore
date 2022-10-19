package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("magicnumber")
public final class Inventory {

    /**
     * Flowers list.
     */
    private final List<Flower> flowers = new ArrayList<>();

    public Inventory() {
        flowers.add(new Flower(FlowerColor.WHITE, 9, FlowerType.CHAMOMILE, 7));
        flowers.add(new Flower(FlowerColor.BLUE, 20, FlowerType.CHAMOMILE, 7));
        flowers.add(new Flower(FlowerColor.RED, 20, FlowerType.CHAMOMILE, 7));

        flowers.add(new Flower(FlowerColor.RED, 100, FlowerType.ROSE, 30));
        flowers.add(new Flower(FlowerColor.WHITE, 80, FlowerType.ROSE, 30));
        flowers.add(new Flower(FlowerColor.BLUE, 90, FlowerType.ROSE, 30));
        flowers.add(new Flower(FlowerColor.RED, 60, FlowerType.ROSE, 20));
        flowers.add(new Flower(FlowerColor.WHITE, 50, FlowerType.ROSE, 20));
        flowers.add(new Flower(FlowerColor.BLUE, 40, FlowerType.ROSE, 20));

        flowers.add(new Flower(FlowerColor.BLUE, 80, FlowerType.TULIP, 20));
        flowers.add(new Flower(FlowerColor.WHITE, 70, FlowerType.TULIP, 20));
        flowers.add(new Flower(FlowerColor.RED, 60, FlowerType.TULIP, 20));
        flowers.add(new Flower(FlowerColor.BLUE, 50, FlowerType.TULIP, 15));
        flowers.add(new Flower(FlowerColor.WHITE, 40, FlowerType.TULIP, 15));
        flowers.add(new Flower(FlowerColor.RED, 30, FlowerType.TULIP, 15));
    }

    public List<Flower> search(final Criteria criteria) {
        return flowers.stream()
                .filter(f -> f.getColor().equals(criteria.getColor().toString()))
                .filter(f -> f.getType().equals(criteria.getType()))
                .filter(f -> f.getPrice() <= criteria.getMaxPrice())
                .filter(f -> f.getSepalLength() >= criteria.getSepalLength())
                .collect(Collectors.toList());
    }
}

