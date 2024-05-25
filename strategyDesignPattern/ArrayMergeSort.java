package strategyDesignPattern;

public class ArrayMergeSort implements ArraySortStrategy { // requirement asks for a new sorting method
                                                          // change name of the class to differentiate
                                                          // between them
    
    public void sort(AuisArray arg) {
        mergeSort(arg, 0, arg.getSize() - 1);
    }
    
    private void mergeSort(AuisArray arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(AuisArray arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr.get(left + i);
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr.get(mid + 1 + j);
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr.set(k, leftArr[i]);
                i++;
            } else {
                arr.set(k, rightArr[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, leftArr[i]);
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, rightArr[j]);
            j++;
            k++;
        }
    }
}

