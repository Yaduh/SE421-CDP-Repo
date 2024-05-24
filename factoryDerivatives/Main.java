package factoryDerivatives;

import factoryDerivatives.customInterfaceImplementation.I;
import factoryDerivatives.customInterfaceImplementation.IFactory;

public class Main{
    public static void main(String...args){
        I obj = IFactory.newInstance(); 
        I obj2 = IFactory.newInstance();
        test(obj);
        test(obj2);

    }
 
    public static void test(I arg){
        arg.print();
    }
}