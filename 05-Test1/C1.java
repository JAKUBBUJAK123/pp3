public class C1 {
    public int different(int[] array1, int[] array2){
        boolean is;
        int counter =0;
        for (int i = 0; i < array1.length; i++) {
            is = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    is = false;
                    break;
                }
            }if (is){
                counter++;
            }
        }return counter;
    }
    public static int secondMax(int[] array){
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
            
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > secondmax){
                if (array[j] < max){
                secondmax = array[j];}
            }
        }
        return secondmax;
    }

    public static void main(String[] args) {
        int[] arr1 = {22,33,892,55,102};
        int[] arr2 = {44,55,66,77,88,99};
        C1 o = new C1();
        System.out.println(o.different(arr1, arr2));
    }
}