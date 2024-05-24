package factoryDerivatives.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    private IFactory(){ // removes the public constructor of IFactory
                        // effectively forcing the usage of the static method newInstance().
    }
    private static I obj;
    public static I newInstance(){

        if(obj == null){
            obj = new A();
        }
        return obj;
    }
    
}
