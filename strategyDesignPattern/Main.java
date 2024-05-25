package strategyDesignPattern;

public class Main {
    public static void main(String...args){
   
    AuisArray arr = new AuisArray(new ArrayMergeSort()); // Inject Merge
    AuisArray arr2 = new AuisArray(new ArrayBubbleSort()); // Inject Bubble
    arr.add(1);
    arr.add(5);
    arr.add(192);
    arr.add(7);
    arr.add(3);
    arr.add(2);

    arr2.add(1);
    arr2.add(5);
    arr2.add(192);
    arr2.add(7);
    arr2.add(3);
    arr2.add(2);
    
    arr.sort();
    arr2.sort();
    }
    
}
