package set;

import java.util.Set;

/**
 * Created by varenik on 20.09.15.
 */
public interface SetInterface {



    /**
     *
     * @return new collection Set (ArraySet or linkedSet)
     */
    Set create();

    /**
     * This method show how much time need for the adding elements in  END collection
     * @param e - quantity of elements in the collection
     * @return  - collection Set (ArraySet or linkedSet)
     */
    Set addElement(int e);



    /**
     *
     * @param f - how element we most find
     * @param e - quantity of elements in the collection
     * @return
     */
        void findByObject(int f, int e);



    /**
     *
     * @param n
     * @param e
     * @return
     */
    void removeRandom(int n, int e);

}
