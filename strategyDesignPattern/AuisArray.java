package strategyDesignPattern;

public class AuisArray {
    private int[] arr = new int[100];
    private int size = 0; 
    
    // new method
    public void sort(ArraySortStrategy arg){
        arg.sort(this);
    }
  
 //---------------------------------------------------------------------------------------------
 














    public int get(int index) {
        return arr[index];
    }
    public void set(int index, int element) {
        arr[index] = element;
    }

    public void add(int element) {
        arr[size] = element;
        size++;
    }
    

    public void remove(int index) {
        
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; 
        size--;
    }
    
    public int getSize() {
        return size;
    }
}
