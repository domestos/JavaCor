package set.linkedHashSet;

import set.SetAbstract;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by varenik on 20.09.15.
 */
public class LinkedHashSetClass extends SetAbstract {

    @Override
    public Set create() {
        Set set = new LinkedHashSet();
        return set;
    }

    @Override
    public Set addElement(int e) {
        System.out.println("LinkedHashSet ADD");
        return super.addElement(e);
    }


    @Override
    public void findByObject( int f, int e) {
        System.out.println("LinkedHashSet findByObject");
        super.findByObject(f, e);
    }

    @Override
    public void removeRandom(int n, int e) {
        System.out.println("LinkedHashSet removeRandom");
        super.removeRandom(n, e);
    }
}

