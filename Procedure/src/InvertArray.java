import java.util.Arrays;
import java.util.Random;

/**
 * Created by varenik on 23.09.15.
 */
public class InvertArray {
    int[] myArray;

    @Override
    public String toString() {
        return "InvertArray{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }

    private int[] getMyArray(int k) {
        myArray = new int [k];
        Random r = new Random();
        for (int i = 0; i <myArray.length ; i++) {
            myArray[i] = r.nextInt(100);
        }
        System.out.println("Before "+Arrays.toString(myArray));
        return myArray;
    }


    public int[] reverse(int k){
        getMyArray(k);
        for (int i = 0; i < myArray.length/2 ; i++) {
            int temp = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = myArray[i];
            myArray[i]=temp;
        }
        System.out.println("After "+Arrays.toString(myArray));
        return myArray;
    }

    public int[] changeElement(int k){
        System.out.println("Before " + Arrays.toString(myArray));

        int[] myArray =  getMyArray(k);
        for (int i = 0; i < myArray.length-1 ; i++) {
            int temp = myArray[i];
            myArray[i]=myArray[i+1];
            myArray[i+1]=temp;
            System.out.println("do "+Arrays.toString(myArray));
        }
        System.out.println("After "+Arrays.toString(myArray));
        return myArray;

    }


    public int findMax(int k){
        int[] myArray = getMyArray(k);
        int max =0;
        for (int i = 0; i < myArray.length ; i++) {
            if (max<myArray[i]){
                max=myArray[i];
            }
        }
        System.out.println(max);
        return max;
    }



}
