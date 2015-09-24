import java.util.Arrays;
import java.util.Random;

/**
 * Created by v.pelenskyi on 24.09.2015.
 */
public class SortArray extends  CreatArray{



    public int findMax(int k){
        System.out.println("    Method findMax");
        int[] myArray = getMyArray(k);
        int max =0;
        for (int i = 0; i < myArray.length ; i++) {
            if (max<myArray[i]){
                max=myArray[i];
            }
        }
        System.out.println("After " + max);
        return max;
    }


    public int[] sortbabble(int k){
        System.out.println("    Sort Babble ");
        int [] myArray = getMyArray(k);
        for (int i = 0; i < myArray.length-1 ; i++) {
            for (int j = 0; j <myArray.length-1-i; j++) {
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("After " + Arrays.toString(myArray) +"\n");
        return myArray;
    }

    public int[] sortBin(int k , int f){
        int[] myArray = getMySortArray(k);
        int l = myArray.length/2;
        while(true ){

            if(f!=myArray[l]){
             if(f<myArray[l]){l=l+(myArray.length-l)/2 ;}else{l=l-(myArray.length-l)/2;}

            }else{
                break;
            }

        }

        return  myArray;
    }

}
