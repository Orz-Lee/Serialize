package entity;

import java.io.Serializable;

public class Employee implements Serializable {

    public String name;
    public String address;
    //注明该属性是短暂的
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

}
