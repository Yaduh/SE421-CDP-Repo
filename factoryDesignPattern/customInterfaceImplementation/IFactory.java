package factoryDesignPattern.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    private IFactory(){ // removes the public constructor of IFactory
                        // effectively forcing the usage of the static method newInstance().
    }
    public static I newInstance(int a){
        if(a == 1){ // if Multiple objects
            return new A();
        }else if(a == 2)
        return new B();
        else 
        return new A(); // default value 
        //(alternatively you could also use switch case)
    }
    
}
