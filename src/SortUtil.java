import java.util.Random;

/**
 * @author NINGTIANMIN
 */
public class SortUtil {
    public static int[] generateRandomArray(int num) {
        int[] array = new int[num];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static boolean assertAscendArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
