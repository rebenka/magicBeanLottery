package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSimpleMath {

    @Test
    public void checkAdd1() {
        SimpleMath sm = new SimpleMath();
        assertEquals("ZZZZZZZZZZZZzzzzzzzzzzzzzzzzzzzzzz", 3, sm.add(1, 2));
    }

}
