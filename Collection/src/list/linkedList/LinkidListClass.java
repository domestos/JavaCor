package list.linkedList;

import list.ListAbstract;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by varenik on 20.09.15.
 */
public class LinkidListClass extends ListAbstract{

    @Override
    public List create() {
        List list = new LinkedList();
        return list;
    }

    @Override
    public List addElement(int e) {
        System.out.println("LinkedList ADD ");
        return super.addElement(e);
    }

    @Override
    public List addElement(int index, int e) {
        System.out.println("LinkedList ADD BEGIN or list.size())/2");
        return super.addElement(index, e);
    }

    @Override
    public List findByInt(int f, int e) {
        System.out.println("LinkedList findByInt");
        return super.findByInt(f, e);
    }

    @Override
    public List findByObject(int f, int e) {
        System.out.println("LinkedList findByObject");
        return super.findByObject(f, e);
    }

    @Override
    public List removeBegining(int n, int e) {
        System.out.println("LinkedList removeBegining");
        return super.removeBegining(n, e);
    }

    @Override
    public List removeEnd(int n, int e) {
        System.out.println("LinkedList removeEnd");
        return super.removeEnd(n, e);
    }

    @Override
    public List removeRandom(int n, int e) {
        System.out.println("LinkedList removeRandom");
        return super.removeRandom(n, e);
    }
}
