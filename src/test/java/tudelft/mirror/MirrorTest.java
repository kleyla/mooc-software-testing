package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void abXYZba() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void abca() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void aba() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }

    @Test
    public void abba() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abba");
        Assertions.assertEquals("abba", result);
    }

    @Test
    public void abcba() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcrba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void abnull() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("aa");
        Assertions.assertEquals("aa", result);
    }
}
