package builderDesignPattern;

public class Shape {
    private final int x;
    private final int y;
    private final int z;

    public Shape(int x, int y, int z){
        this.x= x;
        this.y= y;
        this.z= z;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
       return this.y;
    }
    public int getZ(){
       return this.z;
    }
}


