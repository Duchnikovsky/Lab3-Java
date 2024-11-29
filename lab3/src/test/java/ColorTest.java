import org.example.Color;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    public void testColorConstructorValid() {
        Color color = new Color(255, 0, 150);
        assertEquals(255, color.r());
        assertEquals(0, color.g());
        assertEquals(150, color.b());
        assertEquals(255, color.alpha());
    }

    @Test
    public void testColorConstructorInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Color(256, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Color(255, -1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Color(255, 0, 300));
        assertThrows(IllegalArgumentException.class, () -> new Color(255, 0, 0, 256));
    }
}