import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFourTest {

    @Test
    void findFourTest1() {
        int a[] = {1,3,6,4,5,6,7,4,9,3,10,6,5,3};
        int a1[] ={9, 3, 10, 6, 5, 3};
        Assertions.assertArrayEquals(a1,Main.findFour(a));
    }

    @Test
    void findFourTest2() {
        int a[] = {4,6,7,2,1,6,3,7,4,7,8,2};
        int a1[] ={7,8,2};
        Assertions.assertArrayEquals(a1,Main.findFour(a));
    }

    @Test
    void findFourTest3() {
        int a[] = {1,6,4,8,3,9};
        int a1[] = {8,3,9};
        Assertions.assertArrayEquals(a1,Main.findFour(a));
    }

    @Test
    void findFourTest4() {
        int a[] = {4,3,7,3,8,2,3};
        int a1[] ={3,7,3,8,2,3};
        Assertions.assertArrayEquals(a1,Main.findFour(a));
    }

}