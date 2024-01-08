public class Numbers implements Ok {
    private int[] arr;
    @Override
    public boolean ok() {
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] %2 != 0) {
                return false;
            }
        }
        for (int i = 1; i < arr.length; i+=2) {
            if (arr[i] %2 ==0) {
                return false;
            }
        }
        return true;
    }
    public Numbers(int[] arr) {
        this.arr = arr;
    }
    public static void main(String[] args) {
     int[] arr1 = {6,7,6,1,4};
     int[] arr2 = {2,5,2,8,4};
     System.out.println(new Numbers(arr1).ok());   
    }
}
