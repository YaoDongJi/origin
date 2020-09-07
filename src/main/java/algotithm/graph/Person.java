package algotithm.graph;

import java.util.Arrays;

public class Person {
    private String name ;
    private String role;
    private boolean isCheck;
    public Person(String name,String role ){
        this.name=name;
        this.role=role;
        this.isCheck = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public boolean isCheck() {
        return isCheck;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", isCheck=" + isCheck +
                ", friends=" +
                '}';
    }
}
