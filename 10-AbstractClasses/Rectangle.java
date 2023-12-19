public class Rectangle extends Shape{
    int a;
    int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    @Override
    public double area() {
        return this.a * this.b;
        
    }
    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2*a + 2*b;
    }
    
}
