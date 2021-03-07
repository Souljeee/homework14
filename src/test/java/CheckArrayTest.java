import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayTest {

    @Test
    void checkArrayTest1() {
        int a[] = {1,4,1,1,4,1};
        Assertions.assertEquals(true,Main.checkArray(a));
    }

    @Test
    void checkArrayTest2() {
        int a[] = {1,4,1,1,4,1,6};
        Assertions.assertEquals(false,Main.checkArray(a));
    }

    @Test
    void checkArrayTest3() {
        int a[] = {1,4,1,1,4,1,1,1,4};
        Assertions.assertEquals(true,Main.checkArray(a));
    }

    @Test
    void checkArrayTest4() {
        int a[] = {4,4,4,4};
        Assertions.assertEquals(false,Main.checkArray(a));
    }
}