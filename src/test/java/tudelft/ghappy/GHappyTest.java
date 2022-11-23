package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void xxggxx() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void xxgxx() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void xxggyygxx() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void g() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("g");
        Assertions.assertFalse(result);
    }
}
