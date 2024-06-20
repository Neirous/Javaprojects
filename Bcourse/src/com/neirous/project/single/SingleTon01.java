package com.neirous.project.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance01 = GirlFriend.getInstance();
        System.out.println(instance01);
        GirlFriend instance02 = GirlFriend.getInstance();
        System.out.println(instance02);
    }
}

class GirlFriend{
    private String name;
    public static int n1 = 100;
    private GirlFriend(String name ) {
        this.name = name ;
        System.out.println("创建了一次");
    }
    private static GirlFriend instance = new GirlFriend("xiaohong");
    public static GirlFriend getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
