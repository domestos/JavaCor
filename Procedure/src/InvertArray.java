import java.util.Arrays;
import java.util.Random;

/**
 * Created by varenik on 23.09.15.
 */
public class InvertArray extends CreatArray {


    public int[] reverse(int k){
        System.out.println("    Revers INT");
        getMyArray(k);
        for (int i = 0; i < myArray.length/2 ; i++) {
            int temp = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = myArray[i];
            myArray[i]=temp;
        }
        System.out.println("After "+Arrays.toString(myArray)  +"\n");
        return myArray;
    }

    public int[] changeElement(int k){
        System.out.println("    Change Element ");
        int[] myArray =  getMyArray(k);
        for (int i = 0; i < myArray.length-1 ; i++) {
            int temp = myArray[i];
            myArray[i]=myArray[i+1];
            myArray[i+1]=temp;
        }
        System.out.println("After "+Arrays.toString(myArray)  +"\n");
        return myArray;

    }

}
