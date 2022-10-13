package shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static shop.FlowerType.ROSE;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Flower();
        flower.setType(ROSE);
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

}
