package factoryDesignPattern.customInterfaceImplementation;

public class A implements I{
    A(){ // removes the public constructor outside of the class's java package
        // effectively forcing the usage of IFactory.
    }
    public void print(){
        System.out.println("print called from A.");
    }
}
