/**
 * Created by varenik on 04.10.15.
 * Equals PARADIGMA:
 *
 *       - Reflexive: For any non-null reference value x, x.equals(x) must return true
 *
 *      - Symmetric:  For any non-null reference value x and y, x.equals(y) must return true
 *         and only if y.equals(x) return true
 *
 *      - Transitive: For any non-null reference value x, y, z, if x.equals(y) and y.equals(z),
 *         then  x.equals(z) must return true
 *
 *      - Consistent:  For any non-null reference value x and y, multiple invocation of x.equals(y)
 *         consistently return true or consistently return false. Provided no information used in equals
 *         comparisons on the object is modified.
 *
 */
public class User {
    private String fname;
    private String lname;
    private int age;
    private Animals animals;

    public User(String fname, String lname, int age, Animals animals) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.animals = animals;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (fname != null ? !fname.equals(user.fname) : user.fname != null) return false;

        if (lname != null ? !lname.equals(user.lname) : user.lname != null) return false;
        return !(animals != null ? !animals.equals(user.animals) : user.animals != null);

    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (animals != null ? animals.hashCode() : 0);
        return result;
    }
}
