package problemsWithFactory;

public class ArraySortServiceFactory {
    public static ArraySortService createMerge(){
        return new ArrayMergeSort();
    }
    public static ArraySortService createBubble(){
        return new ArrayBubbleSort();
    }
    public static ArraySortService createLinear(){
        return new ArrayLinearSort();
    }
}
