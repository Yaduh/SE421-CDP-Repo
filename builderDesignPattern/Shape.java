package builderDesignPattern;

public class Shape {
    private int x;
    private int y;
    private int z;

    public Shape(){
        this.x=
        this.y=
        this.z=-1;
    }
    public Shape(int x, int y, int z){
        this.x= x;
        this.y= y;
        this.z= z;
    }

    public Shape(int x, int y){
        this(); // z takes default value of -1
        this.x = x;
        this.y = y;
    }
    public Shape(int x){
        this(); // y and z take default value of -1
        this.x = x;
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


