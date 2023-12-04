import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
    public List<Integer> different(int[] array1, int[] array2){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            boolean is = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    is = true;
                    break;
                    }
            }if (!is){
                list.add(array1[i]);
            }
        }return list;
    }

    public boolean exist (int number ,int[] array){
        for (int i : array) {
            if (i == number){
                return true;
            }
        }return false;
    }
    public int lastColumn(int[][] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][array[i].length -1]);
        }
        return sum;
    }
    public int[][] swap(int[][] array1){
        int num;
        int [][] swappedarray = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            num = array1[i][0];
            array1[i][0] = array1[i][array1[i].length-1];
            array1[i][array1[i].length-1] = num;
            
        }
        return array1;
    } 

    public static void main(String[] args){
        MyArray sjk = new MyArray();
        int[] dick = {1,2,3,4,5,6,7};
        int[] pussy = {1,2,3,3,3,7};
        int[][] dupa = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] kupa = {{1},{2}};
        System.out.println(Arrays.deepToString(sjk.swap(dupa)));
        
        
    }
}
