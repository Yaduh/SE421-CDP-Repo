package problemsWithFactory;

// System Analyst: merge sort so that we can sort 
// any object of AuisArray 

// System Analyst: Bubble sort so that we can sort 
// any object of AuisArray --new requirement

// System Analyst: Linear sort so that we can sort 
// any object of AuisArray --new requirement

public class Main {
    public static void main(String...args){
    ArraySortService service = ArraySortServiceFactory.createMerge();
    AuisArray arr = new AuisArray();
        arr.add(3);
        arr.add(1);
        arr.add(4);
        service.sort(arr);
    }
    
}
