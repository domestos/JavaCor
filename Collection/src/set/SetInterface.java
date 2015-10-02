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
     * This method show, how much time need for the adding elements in  BEGINING collection
     * @param index - index at which the specified element is to be inserted
     * @param e  - quantity of elements in the collection
     * @return - collection Set (ArraySet or linkedSet)
     */
    Set inserElement(int index, int e);


    /**
     *
     * @param f - how element we most find
     * @param e - quantity of elements in the collection
     * @return - collection findSet where has in find element
     */
    Set findByInt(int f, int e);

    /**
     *
     * @param f - how element we most find
     * @param e - quantity of elements in the collection
     * @return
     */
    Set findByObject(int f, int e);


    /**
     *
     * @param n
     * @param e
     * @return
     */
    Set removeEnd(int n, int e);

    /**
     * @param n
     * @param e
     * @return
     */
    Set removeBegining(int n, int e);

    /**
     *
     * @param n
     * @param e
     * @return
     */
    Set removeRandom(int n, int e);

}
