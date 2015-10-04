/**
 * Created by varenik on 04.10.15.
 */
public class Animals {

    private String animal;

    private  String name;

    public Animals(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;
       if (animal != null ? !animal.equals(animals.animal) : animals.animal != null) return false;
        return !(name != null ? !name.equals(animals.name) : animals.name != null);

    }

    @Override
    public int hashCode() {
        int result = animal != null ? animal.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
