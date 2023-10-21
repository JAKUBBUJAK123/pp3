public class rectangle {
    int firstDimension;
    int secondDimension;

    void writeDimension(){
        for (int i= 0; i < firstDimension; i++) {
            for(int j = 0; j <secondDimension; j++){
                System.out.print("[]");
            }
            System.out.print("\n");
        }
    }
}
