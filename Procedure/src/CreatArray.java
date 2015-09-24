import java.util.Arrays;
import java.util.Random;

/**
 * Created by v.pelenskyi on 24.09.2015.
 */
public class CreatArray  {
    int[] myArray;

    protected   int[] getMyArray(int k) {
        myArray = new int [k];
        Random r = new Random();
        for (int i = 0; i <myArray.length ; i++) {
            myArray[i] = r.nextInt(100);
        }
        System.out.println("Before "+ Arrays.toString(myArray));
        return myArray;
    }
}
