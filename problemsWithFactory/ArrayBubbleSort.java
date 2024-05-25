package problemsWithFactory;

// this implementation of sort is not included and is
// purely for your understanding

public class ArrayBubbleSort implements ArraySortService {
    public void sort(AuisArray arg) {
        bubbleSort(arg);
    }
    
    private void bubbleSort(AuisArray arr) {
        int n = arr.getSize();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}