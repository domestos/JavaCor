import list.arrayList.ArrayListClass;
import list.linkedList.LinkidListClass;
import set.hashSet.HashSetClass;
import set.linkedHashSet.LinkedHashSetClass;

import java.util.*;

/**
 * Created by varenik on 20.09.15.
 */
public class Main {

    public static void main(String[] args){
        ArrayListClass arrayListClass = new ArrayListClass();
        LinkidListClass linkidListClass = new LinkidListClass();
        HashSetClass hashSetClass = new HashSetClass();
        LinkedHashSetClass linkedHashSetClass = new LinkedHashSetClass();

        int element = 90000;  // quantity elements in the list
        int findE = 300;    // how elements need find
        int rmE =5000;     // how elements need remove




        //=========== ADD =============
        //add in end
        arrayListClass.addElement(element);
        linkidListClass.addElement(element);
        hashSetClass.addElement(element);
        linkedHashSetClass.addElement(element);
        // add in begining
        arrayListClass.addElement(0,element);
        linkidListClass.addElement(0,element);
        // add in index
        arrayListClass.addElement(2,element);
        linkidListClass.addElement(2,element);

        //=========== FIND =============
        arrayListClass.findByInt(findE, element);
        linkidListClass.findByInt(findE, element);

        arrayListClass.findByObject(findE, element);
        linkidListClass.findByObject(findE, element);

        //========== REMOVE ============
        arrayListClass.removeEnd(rmE, element);
        linkidListClass.removeEnd(rmE, element);

        arrayListClass.removeBegining(rmE,element);
        linkidListClass.removeBegining(rmE,element);

        arrayListClass.removeRandom(rmE,element);
        linkidListClass.removeRandom(rmE,element);

    }

}


/*

        //========== REMOVE ============
        System.out.println("ArrayList");
        arrayListClass.removeBegining(rmE, element);
        arrayListClass.removeEnd(rmE, element);
        arrayListClass.removeRandom(rmE, element);

        System.out.println("LinkedList");
        linkidListClass.removeBegining(rmE, element);
        linkidListClass.removeEnd(rmE, element);
        linkidListClass.removeRandom(rmE, element);

        //=========== FIND =============
        System.out.println("ArrayList");
        arrayListClass.findByInt(findE, element);
        arrayListClass.findByObject(findE, element);

        System.out.println("LinkedList");
        linkidListClass.findByInt(findE, element);
        linkidListClass.findByObject(findE, element);

        //=========== ADD =============

        //====================END
        System.out.print("ArrayList   add END ");
        List list = arrayListClass.addElement(element);


        System.out.print("LinkedList  add END ");
        linkidListClass.addElement(element);

        //==================== BEGINING
        System.out.print("ArrayList   add BEGINING ");
        arrayListClass.addElement(0, element);

        System.out.print("LinkedList  add BEGINING ");
        linkidListClass.addElement(0, element);

        //==================== LIST.SIZE( )/2
        System.out.print("ArrayList   Add list.size()/2 ");
        arrayListClass.addElement(5, element);

        System.out.print("LinkedList  Add list.size()/2 ");
        linkidListClass.addElement(5, element);
*/