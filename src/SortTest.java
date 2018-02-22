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
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals( SortUtil.assertAscendArray(Sort.selectionSort(result)),true);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void insertionSort() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.insertionSort(result)),true);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void optimizeInsertionSort() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals( SortUtil.assertAscendArray(Sort.optimizeInsertionSort(result)),true);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void mergeSort() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.mergeSort(result,0,result.length-1)),true );
        System.out.println(Arrays.toString(result));
    }

    @Test
    void quickSortThreeWays() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.quickSortThreeWays(result,0,result.length-1)),true );
        System.out.println(Arrays.toString(result));
    }

    @Test
    void quickSortTwoWays() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.quickSortTwoWays(result,0,result.length-1)),true );
        System.out.println(Arrays.toString(result));
    }

    @Test
    void bubbleSort() {
        int[] result = new int[DATA_NUM];
        System.arraycopy(ARRAY,0,result,0,DATA_NUM);
        Assert.assertEquals(SortUtil.assertAscendArray(Sort.bubbleSort(result)),true );
        System.out.println(Arrays.toString(result));
    }
}