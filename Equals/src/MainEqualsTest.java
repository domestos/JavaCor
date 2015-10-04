import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by varenik on 04.10.15.
 * if equals return TRUE then hashCode return TRUE
 */

public class MainEqualsTest {

    //=====================================================================================

    /**
     *   - Reflexive:
     *      For any non-null reference value x, x.equals(x) must return true
     */

    @Test
    public void reflexive(){
        User x = new User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        assertEquals(x,x);
    }

    //=====================================================================================

    /**
     * - Symmetric:
     *      For any non-null reference value x and y, x.equals(y) must return
     *       true and only if y.equals(x) return true
     */

    @Test
    public void symmetric(){
        User x = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        User y = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        assertEquals(x,y);
        assertEquals(x.hashCode(), y.hashCode());

    }

    //=====================================================================================

    /**
     *  - Transitive:
     *      For any non-null reference value x, y, z, if x.equals(y)
     *      and y.equals(z), then  x.equals(z) must return true
     *
     */
    @Test
    public void transitive(){
        User x = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        User y = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        User z = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        assertEquals(x,y);
        assertEquals(y,z);
        assertEquals(x,z);

    }

    /**
     *      - Consistent:
     *          multiple  x.equals(y) consistently
     */
    @Test
    public void consistent(){
        User x = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        User y = new  User("ivan", "dorn", 29 , new Animals("cat","pisia"));
        for (int i=10; i >0; i--){
            assertEquals(x,y);
        }

    }



}
