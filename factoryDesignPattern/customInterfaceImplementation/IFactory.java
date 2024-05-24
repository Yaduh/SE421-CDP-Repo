package factoryDesignPattern.customInterfaceImplementation;

// Creates an implementation of the interface 'I'
    public class IFactory { // By encapsulating the keyword 'new'
    private IFactory(){ // removes the public constructor of IFactory
                        // effectively forcing the usage of the static method newInstance().
    }
    public static I newInstanceA(){
        I obj = new A(){
            @Override
            public void print(){
                System.out.println("Print A from IFactory");
            }
        };
        return obj;
    }
    public static I newInstanceB(){
        I obj = new B();
        return obj;
    }
}
