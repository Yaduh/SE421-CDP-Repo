package factoryDesignPattern;
public class Main{
    public static void main(String...args){
        I obj = new A();
        test(obj);
    }

    public static void test(I arg){
        arg.print();
    }
}