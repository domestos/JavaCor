package list.arrayList;

import list.ListAbstract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by varenik on 20.09.15.
 */
public class ArrayListClass extends ListAbstract {

    @Override
    public List create() {
        List list = new ArrayList();
        return list;

    }

    @Override
    public List addElement(int e) {
        System.out.println("ArrayList ADD");
        return super.addElement(e);
    }

    @Override
    public List addElement(int index, int e) {
        System.out.println("ArryList ADD BEGIN or list.size())/2");
        return super.addElement(index, e);
    }

    @Override
    public List findByInt(int f, int e) {
        System.out.println("ArrayList findByInt");
        return super.findByInt(f, e);
    }

    @Override
    public List findByObject(int f, int e) {
        System.out.println("ArrayList findByObject");
        return super.findByObject(f, e);
    }

    @Override
    public List removeBegining(int n, int e) {
        System.out.println("ArrayList removeBegining");
        return super.removeBegining(n, e);
    }

    @Override
    public List removeEnd(int n, int e) {
        System.out.println("ArrayList removeEnd");
        return super.removeEnd(n, e);
    }

    @Override
    public List removeRandom(int n, int e) {
        System.out.println("ArrayList removeRandom");
        return super.removeRandom(n, e);
    }
}
