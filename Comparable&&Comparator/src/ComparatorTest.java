import org.hamcrest.CoreMatchers;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by varenik on 05.10.15.
 */

public class ComparatorTest {

    public List creatList(){

        String str  = "aaa";
        String str1 = "Aaa";
        String str2 = "bbb";
        String str3 = "Bbb";

        List<String> list = new ArrayList<>();

        list.add(str1);
        list.add(str);
        list.add(str3);
        list.add(str2);
        return list;
    }

    @Test
    public  void  testCompareDependenceUppercase(){
        List list = creatList();
        System.out.println("dependence uppercase");
        System.out.println("before sort" + list);
        Collections.sort(list);
        System.out.println("After sort " + list);
            assertThat(list.get(0), CoreMatchers.<Object>is("Aaa"));
            assertThat(list.get(1), CoreMatchers.<Object>is("Bbb"));
            assertThat(list.get(2), CoreMatchers.<Object>is("aaa"));
            assertThat(list.get(3), CoreMatchers.<Object>is("bbb"));
    }

    @Test
    public void testCompareToIgnoreCase(){
        List list = creatList();
        System.out.println("before sort" + list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("After " + list);
        assertThat(list.get(0), CoreMatchers.<Object>is("Aaa"));
        assertThat(list.get(1), CoreMatchers.<Object>is("aaa"));
        assertThat(list.get(2), CoreMatchers.<Object>is("Bbb"));
        assertThat(list.get(3), CoreMatchers.<Object>is("bbb"));
    }


}
