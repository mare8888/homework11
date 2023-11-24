package Domawka13;

public class User {
    public String Name;
    public String Surname;
    public Integer Age;
    public String Email;

    public User(String name, String surname, Integer age, String email) {
        Name = name;
        Surname = surname;
        Age = age;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Domawka13.User{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                '}';
    }
}
