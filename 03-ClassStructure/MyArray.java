
public class MyArray {
    public int even(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 ==0){
                counter ++;
            }
        }
        return counter;
    }
    public int positiveOdd(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 !=0 && array[i]>0){
                counter ++;
            }
        }
        return counter;
    }
    public int[] revert(int[] array){
        int start =0;
        int end = array.length -1;
        int change;
        while (start< end) {
            change = array[start];
            array[start] =array[end];
            array[end] = change;
            start ++;
            end --;
        }
        return array;
    }

    public boolean compare(int[] a1 , int[] a2){
        if (a1 == a2){
            return true;
        }else{
            return false;
        }
    }
    public String number(int[] a1 ,int[] a2){
        boolean is = false;
        String jd ="";
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]){
                    is = true;
                }    
            }
            if (is ==false){
                jd += Integer.toString(a1[i]) + " ";
            }
            is = false;
        }
        return jd;

    }


    public static void main(String[] args){
        MyArray sjk = new MyArray();
        int[] dick = {1,2,3,4,5,6,7};
        int[] pussy = {1,2,3,3,3,7};
        System.out.println(sjk.number(dick, pussy));
    }
}
