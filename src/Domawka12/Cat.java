import javax.swing.*;
import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 2L;
    private String Name;
    private Integer Age;
    private transient Integer Weight;

    public Cat(String name, Integer age, Integer weight) {
        Name = name;
        Age = age;
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                '}';
    }
}
