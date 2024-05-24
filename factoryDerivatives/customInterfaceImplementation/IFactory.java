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

    public static void setInstance(I i){
        obj = i;
    }
    // lazy loading
    public static I getInstance(){ 
        if(obj != null){
            return obj;
        }
        return new A();
    }
    
}
