public class SurfaceArea {
    public int cuboid(int x, int y, int z){
        int surface = x*y + x*y + 2*(x*z) + 2*(z*y);
        return surface;
    }
    public double sphere( int r){
        double surface = 4* r*r * Math.PI;
        return surface;
    }
    public double cone(int r, int l){
        return Math.PI * r *(r+l);
    }
}
