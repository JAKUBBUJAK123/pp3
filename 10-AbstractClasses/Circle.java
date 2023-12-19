public class Circle extends Shape{
    double r;
    double pi = 3.14;
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return this.pi * this.r * this.r;
    }
    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2 * pi * r;
    }
    
}
