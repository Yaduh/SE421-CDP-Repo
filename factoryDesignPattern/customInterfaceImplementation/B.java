package factoryDesignPattern.customInterfaceImplementation;
public class B implements I{ // forgot to add -my apologies

    B(){ // removes the public constructor outside of the class's java package 
        // effectively forcing the usage of IFactory.
    }
    public void print(){
        System.out.println("print called from B.");
    }
}
