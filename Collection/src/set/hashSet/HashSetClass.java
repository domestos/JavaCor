package set.hashSet;

import set.SetAbstract;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by varenik on 20.09.15.
 */
public class HashSetClass extends SetAbstract {

    @Override
    public Set create() {
        Set set = new HashSet();
        return set;
    }

    @Override
    public Set addElement(int e) {
        System.out.println("HashSet ADD");
        return super.addElement(e);
    }

    @Override
    public void findByObject( int f, int e) {
        System.out.println("HashSet findByObject");
       super.findByObject(f,e);
    }

    @Override
    public void removeRandom(int n, int e) {
        System.out.println("HashSet removeRandom");
      super.removeRandom(n, e);
    }
}
