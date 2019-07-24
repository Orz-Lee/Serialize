package demo;

import entity.Person;

import java.io.*;
import java.text.MessageFormat;

public class TestObjSerializeAndDeserialize {

    public static void main(String[] args) throws Exception {

        SerializePerson();//序列化Person对象
        Person p = DeserializePerson();//反序列Perons对象
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",p.getName(), p.getAge(), p.getSex()));
    }

    private static void SerializePerson() throws IOException {
        Person person = new Person();
        person.setName("小明");
        person.setAge(11);
        person.setSex("男");
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:/Person.txt")));
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    private static Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }


}
