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
}
