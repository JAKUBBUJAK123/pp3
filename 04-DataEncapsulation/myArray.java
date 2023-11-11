public class myArray {
    public static int odd(int[] array){
        int counter= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 !=0 && array[i] >0) {
                counter ++;
            }
        }return counter;
    }
    public static int above(int[] array){
        int sum=0;
        int average;
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; 
        }average = sum/array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>average){
                counter += array[i];
            }
        }return counter;
    }
    public static void main(String[] args){
        int[] arr = {3,2,-5,4,1,7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(above(arr));
    }
}
