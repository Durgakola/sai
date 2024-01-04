package practice;

public class Person {
    public String name;
    public String village;
    public String branch;

    public Person(String name,String village,String branch) {
        this.name = name;
        this.village=village;
        this.branch=branch;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", village='" + village + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
