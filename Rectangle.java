public class Rectangle{
    private float length = 1;
    private float width = 1;

    public Rectangle(){
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }
}