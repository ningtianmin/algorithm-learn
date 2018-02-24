/**
 * @author NINGTIANMIN
 */
public class Sort {
    /**
     * selection sort
     */
    public static int[] selectionSort(int[] array) {
        for (int position = 0; position < array.length - 1; position++) {
            int minimumValueIndex = position;
            for (int index = minimumValueIndex + 1; index < array.length; index++) {
                if (array[index] < array[minimumValueIndex]) {
                    minimumValueIndex = index;
                }
            }
            int temp = array[position];
            array[position] = array[minimumValueIndex];
            array[minimumValueIndex] = temp;
        }
        return array;
    }

    /**
     * insertion sort
     */
    public static int[] insertionSort(int[] array) {
        for (int position = 1; position < array.length; position++) {
            for (int index = position; index > 0; index--) {
                if (array[index] < array[index - 1]) {
                    int temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    /**
     * optimize insertion sort
     */
    public static int[] optimizeInsertionSort(int[] array) {
        for (int position = 1; position < array.length; position++) {
            int temp = array[position];
            for (int index = position; index > 0; index--) {
                if (temp < array[index - 1]) {
                    array[index] = array[index - 1];
                } else {
                    array[index] = temp;
                    break;
                }
            }
        }
        return array;
    }

    /**
     * merge sort
     *
     * @param left  inclusive
     * @param right inclusive
     */
    public static int[] mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return array;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        if (array[mid] <= array[mid + 1]) {
            return array;
        }
        int[] copyArray = new int[right - left + 1];
        System.arraycopy(array, left, copyArray, 0, copyArray.length);
        for (int i = 0, j = mid - left + 1, position = 0; position < copyArray.length; position++) {
            if (i > mid - left) {
                array[position + left] = copyArray[j++];
            } else if (j > copyArray.length - 1) {
                array[position + left] = copyArray[i++];
            } else if (copyArray[i] <= copyArray[j]) {
                array[position + left] = copyArray[i++];
            } else if (copyArray[i] > copyArray[j]) {
                array[position + left] = copyArray[j++];
            }
        }
        return array;
    }

    /**
     * quick sort by two ways
     *
     * @param leftIndex  inclusive
     * @param rightIndex inclusive
     */
    public static int[] quickSortTwoWays(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return array;
        }
        int ltIndex = leftIndex;
        int gtIndex = rightIndex;
        int standard = array[leftIndex];
        while (ltIndex < gtIndex) {
            while (ltIndex < gtIndex && array[gtIndex] >= standard) {
                gtIndex--;
            }
            while (ltIndex < gtIndex && array[ltIndex] <= standard) {
                ltIndex++;
            }
            if (ltIndex < gtIndex) {
                int temp = array[gtIndex];
                array[gtIndex] = array[ltIndex];
                array[ltIndex] = temp;
            }
        }
        array[leftIndex] = array[ltIndex];
        array[ltIndex] = standard;
        quickSortTwoWays(array, leftIndex, ltIndex - 1);
        quickSortTwoWays(array, ltIndex + 1, rightIndex);
        return array;
    }

    /**
     * quick sort by three ways
     *
     * @param leftIndex  inclusive
     * @param rightIndex inclusive
     */
    public static int[] quickSortThreeWays(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return array;
        }
        int ltIndex = leftIndex;
        int gtIndex = rightIndex;
        int leftEqual = leftIndex - 1;
        int rightEqual = rightIndex + 1;
        int temp;
        int standard = array[leftIndex];
        while (ltIndex < gtIndex) {
            while (ltIndex < gtIndex) {
                if (array[gtIndex] > standard) {
                    gtIndex--;
                } else if (array[gtIndex] == standard) {
                    temp = array[--rightEqual];
                    array[rightEqual] = array[gtIndex];
                    array[gtIndex] = temp;
                    gtIndex--;
                } else {
                    break;
                }
            }
            while (ltIndex < gtIndex) {
                if (array[ltIndex] < standard) {
                    ltIndex++;
                } else if (array[ltIndex] == standard) {
                    temp = array[++leftEqual];
                    array[leftEqual] = array[ltIndex];
                    array[ltIndex] = temp;
                    ltIndex++;
                } else {
                    break;
                }
            }
            if (ltIndex < gtIndex) {
                temp = array[ltIndex];
                array[ltIndex] = array[gtIndex];
                array[gtIndex] = temp;
            }
        }
        int a = ltIndex;
        int b = ltIndex + 1;
        for (int i = leftEqual; i >= leftIndex; i--, a--) {
            array[i] = array[a];
            array[a] = standard;
        }
        for (int j = rightEqual; j <= rightIndex; j++, b++) {
            array[j] = array[b];
            array[b] = standard;
        }
        quickSortThreeWays(array, leftIndex, a);
        quickSortThreeWays(array, b, rightIndex);
        return array;
    }

    /**
     * bubble sort
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * heap sort
     */
    public static int[] heapSort(int[] array, int rightIndex) {
        if (rightIndex < 1) {
            return array;
        }
        int temp;
        for (int position = (rightIndex - 1) / 2; position >= 0; position--) {
            int biggerIndex = 2 * position + 1;
            if (biggerIndex + 1 <= rightIndex && array[biggerIndex] < array[biggerIndex + 1]) {
                biggerIndex++;
            }
            if (array[biggerIndex] > array[position]) {
                temp = array[position];
                array[position] = array[biggerIndex];
                array[biggerIndex] = temp;
            }
        }
        temp = array[rightIndex];
        array[rightIndex] = array[0];
        array[0] = temp;
        heapSort(array, rightIndex - 1);
        return array;
    }
}
