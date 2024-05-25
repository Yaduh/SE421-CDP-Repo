package builderDesignPattern;

public class ShapeBuilder {
    private int x;
    private int y;
    private int z;

    ShapeBuilder(){
        this.x = this.y = this.z =-1;
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

    public ShapeBuilder setX(int x){
        this.x = x;
        return this;
    }
    public ShapeBuilder setY(int y){
        this.y = y; 
        return this;
    }
    public ShapeBuilder setZ(int z){
        this.z = z; 
        return this;
    }

    public Shape build(){
        Shape s = new Shape(this.getX(),this.getY(),this.getZ());
        return s;
    }
}
