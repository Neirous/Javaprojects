package com.neirous.project.generic.homework.homework2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {

    }

    @Test
    public void testList(){
        DAQ<User> userDAQ = new DAQ<>();
        userDAQ.save("001",new User(1,10,"jack"));
        userDAQ.save("002",new User(2,18,"king"));
        userDAQ.save("003",new User(1,28,"tom"));

        List<User> list = userDAQ.list();
        System.out.println(list);

        userDAQ.update("003",new User(3,58,"milan"));
        System.out.println("======修改后======");

        list = userDAQ.list();
        System.out.println(list);
    }
}
class DAQ<T>{
    private HashMap<String,T> hashMap = new HashMap<>();

    public void save(String id,T entity){
        hashMap.put(id,entity);
    }
    public T get(String id){
        return hashMap.get(id);

    }
    public void update(String id,T entity){
        hashMap.replace(id, entity);
    }
    public List<T> list(){
        Collection<T> values = hashMap.values();
        List<T> list = new ArrayList<>(values);
        return list;
    }
    public void delete(String id){
        hashMap.remove(id);
    }

}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

