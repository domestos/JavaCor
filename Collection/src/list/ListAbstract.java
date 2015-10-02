package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by varenik on 20.09.15.
 */
public abstract class ListAbstract implements ListInterface {

    private List add(int e){
        List list =  create();
        for (int j = 0; j < e  ; j++) {
            list.add("String " + j);
        }
        return list;
    }

    @Override
    public List addElement(int e) {
            long  timeStart = System.currentTimeMillis();
              List list =  add(e);
            long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  = "+(timeEnd - timeStart) + " ms \n");
        return list;
    }

    @Override
    public List inserElement(int index, int e) {
        List list =  create();
        long  timeStart = System.currentTimeMillis();
        if (index !=0){
            for (int j = 0; j < e  ; j++) {
               list.add((list.size())/index,"String " + j);
            }
        }else{
            for (int j = 0; j < e  ; j++) {
                list.add(index,"String " + j);
            }
        }
        long timeEnd = System.currentTimeMillis();
       System.out.println(" Time  = "+(timeEnd - timeStart) + " ms \n");
        return list;
    }

    @Override
    public List findByInt(int f, int e) {
        List list =add(e);
        List findList =null;
        if( list.getClass().getName()=="java.util.ArrayList"){
            findList = new ArrayList();
        }else{
            findList = new LinkedList();}

        long  timeStart = System.currentTimeMillis();
        if(list.isEmpty()){
                System.out.println("your list isEmpty");
            }else{
                int sizeList = list.size();
                Random r = new Random();
                for (int i = 0; i <f ; i++) {
                            findList.add(
                                    list.get(r.nextInt(sizeList)));
                }
            }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  = "+(timeEnd - timeStart) + " ms \n");
            return findList;
        }

    @Override
    public List findByObject(int f, int e) {
        List list = add(e);

         List findList =null;

        if( list.getClass().getName()=="java.util.ArrayList"){
            findList = new ArrayList();
        }else{
            findList = new LinkedList();}

        long  timeStart = System.currentTimeMillis();
        if(list.isEmpty()){
            System.out.println("your list isEmpty");
        }else{
            int sizeList = list.size();
            Random r = new Random();
            for (int i = 0; i <f ; i++) {
                String s = "String "+String.valueOf(r.nextInt(sizeList));
                findList.add(
                        list.get(list.indexOf(s)));
            }
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  = "+(timeEnd - timeStart) + " ms \n");
        return findList;
    }

    @Override
    public List removeEnd(int n, int e) {
        List list =add(e);
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            list.remove(list.size()-1);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  "+ (timeEnd-timeStart) + " ms \n");
        return list;
    }

    @Override
    public List removeBegining(int n, int e) {
        List list =add(e);
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            list.remove(0);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  "+ (timeEnd-timeStart)+ " ms \n");
        return list;
    }

    @Override
    public List removeRandom(int n, int e) {
        List list =add(e);
        Random r = new Random();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            list.remove(r.nextInt(list.size()));
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(" Time  "+ (timeEnd-timeStart)+ " ms \n");
        return list;
    }
}
