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

        int element = 9000000;  // quantity elements in the list
        int findE = 4000;    // how elements need find
        int rmE =40;     // how elements need remove

//        //=========== ADD =============
        arrayListClass.addElement(element);
        linkidListClass.addElement(element);
        hashSetClass.addElement(element);
        linkedHashSetClass.addElement(element);
//
//        // ========== INSERT ==================
//        arrayListClass.inserElement(0,element);
//        linkidListClass.inserElement(0,element);
//        // add in index
//        arrayListClass.inserElement(4,element);
//        linkidListClass.inserElement(4,element);
//
//        //=========== FIND =============
//        arrayListClass.findByInt(findE, element);
//        linkidListClass.findByInt(findE, element);
//
//        arrayListClass.findByObject(findE, element);
//        linkidListClass.findByObject(findE, element);
//         hashSetClass.findByObject(findE,element);
//        linkedHashSetClass.findByObject(findE,element);
//
//        //========== REMOVE ============
//        arrayListClass.removeEnd(rmE, element);
//        linkidListClass.removeEnd(rmE, element);
//
//        arrayListClass.removeBegining(rmE,element);
//        linkidListClass.removeBegining(rmE,element);
//
//        arrayListClass.removeRandom(rmE,element);
//        linkidListClass.removeRandom(rmE,element);
//        hashSetClass.removeRandom(rmE,element);
//        linkedHashSetClass.removeRandom(rmE,element);

    }

}

