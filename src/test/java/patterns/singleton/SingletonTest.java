package patterns.singleton;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    void getInstance() {
        Singleton s = Singleton.getInstance();
        assertNotEquals(s, null);
    }

    @Test
    void doubleInitializeInstance() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertEquals(s1, s2);
    }

}