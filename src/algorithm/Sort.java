package algorithm;
//finished some of them
public class Sort {

    long executionTime = 0;

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            for (int x = i; x > 0; x--) {
                if (array[i] < array[x - 1]) {
                    int temp = array[x];
                    array[x] = array[x - 1];
                    array[x - 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length; i++) {
            for (int x = 1; x < array.length - 1; x++) {
                if (array[x - 1] > array[x]) {
                    int temp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] quickSort(int[] array, int low, int high) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (low < high) {
            int n = part(array, low, high);
            quickSort(array, n + 1, n - 1);
            quickSort(array, n + 1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = array.length - 1; i >= 1; i--) {
            int t = array[0];
            array[0] = array[i];
            array[i] = t;
            heapSorting(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int value = getMax(array);
        int[] bucket = new int[value + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //this was created for the heap sort method
    public void heapSorting(int[] array, int l, int m) {
        int max;
        int p;
        p = 2 * m + 1;
        max = m;
        if (p < l) ;
        if (array[p] > array[max])
            max = p;
        if (p + 1 < l)
            if (array[p + 1] > array[max])
                max = p + 1;
        if (max != m) {
            int temp = array[m];
            array[m] = array[max];
            array[max] = temp;
        }
    }

    public void heapSorts(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapSorting(array, array.length, i);
        }
    }

    public int getMax(int[] array) {
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > k) {
                k = array[i];
            }
        }
        return k;
    }


    public int part(int array[], int q, int w) {
        int partitionMth = q - 1;
        int pivot = array[w];
        for (int i = q; i <= w; i++) {
            if (array[i] <= pivot) {
                partitionMth++;
                if (partitionMth != i) {
                    array[partitionMth] = array[partitionMth] ^ array[i];
                    array[i] = array[partitionMth] ^ array[i];
                    array[partitionMth] = array[partitionMth] ^ array[i];
                }
            }
        }
        return partitionMth;
    }
}
        /*
         * Please implement all the sorting algorithm. Feel free to add helper methods.
         * Store all the sorted data into one of the databases.
         */

