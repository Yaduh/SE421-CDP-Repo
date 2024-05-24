package factoryDesignPattern.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    private IFactory(){ // removes the public constructor of IFactory
                        // effectively forcing the usage of the static method newInstance().
    }
    public static I newInstance(boolean isA){
        if(isA){ // if two objects
            return new A();
        }
        return new B();
    }
    
}
