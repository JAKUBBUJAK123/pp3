public class Triangle extends Shape{
    int a;
    int h;
    int b;
    int c;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return a+b+c;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0.5 * this.a * this.h;
    }
    
}
