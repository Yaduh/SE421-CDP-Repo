package problemsWithFactory;

// this implementation of sort is not included and is
// purely for your understanding

public class ArrayLinearSort implements ArraySortService {

    @Override
    public void sort(AuisArray arg) {
        countingSort(arg);
    }
    private void countingSort(AuisArray arr) {
        int size = arr.getSize();
        if (size == 0) {
            return;
        }
        int max = arr.get(0);
        for (int i = 1; i < size; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < size; i++) {
            count[arr.get(i)]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr.set(index++, i);
                count[i]--;
            }
        }
    }
}
