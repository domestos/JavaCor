package set;

import java.util.Iterator;
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
    public Set inserElement(int index, int e) {

        return null;
    }

    @Override
    public Set findByInt(int f, int e) {
        Set set = add(e);
        Set findSet = null;
        Random r = new Random();
        Iterator iterator = set.iterator();

        for (int i = 0; i <f ; i++) {
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }

           }
        return findSet;
    }

    @Override
    public Set findByObject(int f, int e) {
        return null;
    }

    @Override
    public Set removeEnd(int n, int e) {
        return null;
    }

    @Override
    public Set removeBegining(int n, int e) {
        return null;
    }

    @Override
    public Set removeRandom(int n, int e) {
        return null;
    }
}
