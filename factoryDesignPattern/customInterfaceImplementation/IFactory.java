package factoryDesignPattern.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    public static I newInstance(){
        I obj = new A();
        return obj;
    }
}
