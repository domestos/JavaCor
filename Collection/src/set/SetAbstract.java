package set;

import java.util.Random;
import java.util.Set;

/**
 * Created by varenik on 20.09.15.
 */
public abstract class SetAbstract implements SetInterface  {

    private Set add(int e){
        Set set = create();
        for (int i = 0; i < e ; i++) {
            set.add("String " + i);

        }
        return set;
    }

    @Override
    public Set addElement(int e) {
        long  timeStart = System.currentTimeMillis();
        Set set = add(e);
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  = "+(timeEnd - timeStart) + " ms \n");
        return set;
    }

    @Override
    public void findByObject( int f,int e) {
    Set set = add(e);
        Random r = new Random();
        long  timeStart = System.currentTimeMillis();
        int findElement=0;
        for (int i = 0; i<f; i++){
            String s = "String "+r.nextInt(e);
            if ( set.contains(s)) {findElement++;}
        }
        System.out.println(" you find  "+findElement+" element");
        long timeEnd = System.currentTimeMillis();

        System.out.println(" Time  = " + (timeEnd - timeStart) + " ms \n ");
    }


    @Override
    public void removeRandom(int n, int e) {
        Set set = add(e);
        Random r = new Random();
        int deleteElement=0;
        int findElement=0;
        long  timeStart = System.currentTimeMillis();
        for (int i = 0; i<n; i++){
            String s = "String "+String.valueOf(r.nextInt(e));
            if ( set.remove(s)) {deleteElement++;}

        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" you delete "+deleteElement+" element");
        System.out.println(" Time  = " + (timeEnd - timeStart) + " ms \n ");
    }
}
