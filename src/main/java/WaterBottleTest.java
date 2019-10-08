import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    @Test
    public void volumeIs100() {
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.checkVolume());
    }

    @Test
    public void drink() {
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty() {
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fill() {
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.fill());
    }
}