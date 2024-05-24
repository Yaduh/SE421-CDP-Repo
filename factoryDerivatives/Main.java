package factoryDerivatives;

import factoryDerivatives.customInterfaceImplementation.I;
import factoryDerivatives.customInterfaceImplementation.IFactory;

public class Main{
    public static void main(String...args){

        IFactory.setInstance(new I(){
            public void print(){
                System.out.println("Custom");
            }
        });

        I obj = IFactory.getInstance(); 
        I obj1 = IFactory.getInstance();

        I obj2 = IFactory.getInstance2();
        I obj3 = IFactory.getInstance2();
        test(obj);
        test(obj1);
        System.out.println( 
        "-----------------------------------------------------------------"
        );
        test(obj2);
        test(obj3);

    }
 
    public static void test(I arg){
        arg.print();
    }
}