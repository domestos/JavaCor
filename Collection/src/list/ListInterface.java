package list;

import java.util.List;

/**
 * Created by varenik on 20.09.15.
 */
public interface ListInterface {

    /**
     *
     * @return new collection list (ArrayList or linkedList)
     */
    List create();

    /**
     * This method show how much time need for the adding elements in  END collection
     * @param e - quantity of elements in the collection
     * @return  - collection list (ArrayList or linkedList)
     */
    List addElement(int e);

    /**
     * This method show, how much time need for the adding elements in  BEGINING collection
    * @param index - index at which the specified element is to be inserted
    * @param e  - quantity of elements in the collection
    * @return - collection list (ArrayList or linkedList)
    */
    List addElement(int index, int e);


    /**
     *
     * @param f - how element we most find
     * @param e - quantity of elements in the collection
     * @return - collection findList where has in find element
     */
    List findByInt(int f, int e);

    /**
     *
     * @param f - how element we most find
     * @param e - quantity of elements in the collection
     * @return
     */
    List findByObject(int f, int e);

    /**
     * @param n
     * @param e
     * @return
     */
    List removeEnd(int n, int e);

    /**
     *
     * @param n
     * @param e
     * @return
     */
    List removeBegining(int n, int e);

    /**
     *
     * @param n
     * @param e
     * @return
     */
    List removeRandom(int n, int e);

}
