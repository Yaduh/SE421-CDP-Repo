package factoryDesignPattern;

import factoryDesignPattern.customInterfaceImplementation.I;
import factoryDesignPattern.customInterfaceImplementation.IFactory;

public class Main{
    public static void main(String...args){
        I obj = IFactory.newInstance(true); 
        test(obj);

    }
 
    public static void test(I arg){
        arg.print();
    }
}