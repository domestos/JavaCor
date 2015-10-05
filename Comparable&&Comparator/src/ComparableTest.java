import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by varenik on 05.10.15.
 */
public class ComparableTest {

    @Test
    public void comparatorTest(){
        User user = new User("Valera", 29);
        User user1 =new User("Devid", 19);

        List<User> list = new ArrayList();
        list.add(user);     // list.get(0).getName() = Valera
        list.add(user1);    // list.get(1).getName() Devid

        Collections.sort(list); // sort Object where implements Comparable

        assertThat(list.get(0).getName(), is("Devid"));
        assertThat(list.get(1).getName(), is("Valera"));

    }
}
