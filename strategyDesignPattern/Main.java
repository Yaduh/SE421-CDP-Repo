package strategyDesignPattern;

public class Main {
    public static void main(String...args){
   
    AuisArray arr = new AuisArray();
    arr.add(1);
    arr.add(5);
    arr.add(192);
    arr.add(7);
    arr.add(3);
    arr.add(2);
    arr.sort(new ArrayMergeSort());
    arr.sort(new ArrayBubbleSort());
    }
    
}
