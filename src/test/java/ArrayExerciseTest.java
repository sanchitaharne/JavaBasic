import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class ArrayExerciseTest {

    ArrayExercise ae = new ArrayExercise();

    @Test
    public void toUpperCase(){

    String[] input = new String[]{"mon", "tue", "wed"};
    ae.arrayToUpperCase(input);
    assertArrayEquals(new String[]{"MON", "TUE", "WED"}, input);

    }
    @Test
    public void incrementArray(){
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        ae.incrementArray(input);
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 6}, input);

    }
}
