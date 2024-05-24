package factoryDerivatives.customInterfaceImplementation;

// Signleton Design Pattern.
    public class IFactory { 
    private IFactory(){}
    // solution 2
        private static I obj2 = new A();
        public static I getInstance2(){
            return obj2;
        }
    

    // solution 1             
    private static I obj;
    public static I getInstance(){ //changed name from newInstance to getInstance. 
                                    // because we access the same object everytime.
        if(obj == null){
            obj = new A();
        }
        return obj;
    }
    
}
