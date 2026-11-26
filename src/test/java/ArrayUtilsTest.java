import org.example.ArrayUtils;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testMergeSort() {
        int[] array = {5, 2, 8, 1, 3};

        ArrayUtils.mergeSort(array);

        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, array);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] array = {};

        ArrayUtils.mergeSort(array);

        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testMergeSortSingleElement() {
        int[] array = {5};

        ArrayUtils.mergeSort(array);

        assertArrayEquals(new int[]{5}, array);
    }

    @Test
    public void testMergeSortDuplicates() {
        int[] array = {4, 2, 4, 1, 2};

        ArrayUtils.mergeSort(array);

        assertArrayEquals(new int[]{1, 2, 2, 4, 4}, array);
    }

    @Test
    public void testBinarySearchFound() {
        int[] array = {1, 2, 3, 4, 5};

        int result = ArrayUtils.binarySearch(array, 3);

        assertEquals(2, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};

        int result = ArrayUtils.binarySearch(array, 8);

        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchFirstElement() {
        int[] array = {1, 2, 3, 4, 5};

        int result = ArrayUtils.binarySearch(array, 1);

        assertEquals(0, result);
    }

    @Test
    public void testBinarySearchLastElement() {
        int[] array = {1, 2, 3, 4, 5};

        int result = ArrayUtils.binarySearch(array, 5);

        assertEquals(4, result);
    }
}

