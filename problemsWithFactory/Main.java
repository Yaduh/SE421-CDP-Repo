package problemsWithFactory;


public class Main {
    public static void main(String...args){
    
    AuisArray arr = new AuisArray();
        arr.add(3);
        arr.add(1);
        arr.add(4);
    ArraySortService service = new ArraySortService();
    service.sort(arr);
    }
    
}
