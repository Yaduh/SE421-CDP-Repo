package factoryDerivatives.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    private IFactory(){ // removes the public constructor of IFactory
                        // effectively forcing the usage of the static method newInstance().
    }
    private static int counter = 1;
    public static I newInstance(){
        counter++;
        if(counter == 1){ 
            return new A();
        }else {
            counter = 0;
            return new B();
        }
             
        //(alternatively you could also use switch case)
    }
    
}
