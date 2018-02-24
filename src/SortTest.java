import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

/**
 * @author NINGTIANMIN
 */
public class SortTest {
    private  final int DATA_NUM = 3000;
    private  final int[] ARRAY=SortUtil.generateRandomArray(DATA_NUM);

    @Test
    void selectionSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("selectionSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.selectionSort(array)), true);
        System.out.println(String.format("selectionSort result: %s", Arrays.toString(array)));
    }

    @Test
    void insertionSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("insertionSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.insertionSort(array)), true);
        System.out.println(String.format("insertionSort result: %s", Arrays.toString(array)));
    }

    @Test
    void optimizeInsertionSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("optimizeInsertionSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.optimizeInsertionSort(array)), true);
        System.out.println(String.format("optimizeInsertionSort result: %s", Arrays.toString(array)));
    }

    @Test
    void mergeSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("mergeSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.mergeSort(array, 0, array.length - 1)), true);
        System.out.println(String.format("mergeSort result: %s", Arrays.toString(array)));
    }

    @Test
    void quickSortThreeWays() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("quickSortThreeWays array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.quickSortThreeWays(array, 0, array.length - 1)), true);
        System.out.println(String.format("quickSortThreeWays result: %s", Arrays.toString(array)));
    }

    @Test
    void quickSortTwoWays() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("quickSortTwoWays array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.quickSortTwoWays(array, 0, array.length - 1)), true);
        System.out.println(String.format("quickSortTwoWays result: %s", Arrays.toString(array)));
    }

    @Test
    void bubbleSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("bubbleSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.bubbleSort(array)), true);
        System.out.println(String.format("bubbleSort result: %s", Arrays.toString(array)));
    }

    @Test
    void heapSort() {
        int[] array = new int[DATA_NUM];
        System.arraycopy(ARRAY, 0, array, 0, DATA_NUM);
        System.out.println(String.format("heapSort array: %s", Arrays.toString(array)));
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.heapSort(array, array.length - 1)), true);
        System.out.println(String.format("heapSort result: %s", Arrays.toString(array)));
    }
}