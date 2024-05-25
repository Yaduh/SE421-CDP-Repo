package builderDesignPattern;

public class Main {
    public static void main(String...args){
    ShapeBuilder builder = new ShapeBuilder();

    Shape s = builder // (-1,-1,-1)
    .setX(10) // (10,-1,-1)
    .setY(0) // (10,0,-1)
    .setZ(30)// (10,0,30)
    .build(); 
    
    print(s);
    }
    

    static void print(Shape s){
        System.out.println(s.getX());
        System.out.println(s.getY());
        System.out.println(s.getZ());


    }
}
