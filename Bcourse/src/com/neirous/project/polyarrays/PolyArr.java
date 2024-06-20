package com.neirous.project.polyarrays;

public class PolyArr {
    public static void main(String[] args) {
        //多台数组：数组定义为父类类型，里面保存的实际元素为子类类型

        Person[] person = new Person[5];
        person[0] = new Student("jack",18,97.5);
        person[1] = new Student("smith",19,100);
        person[2] = new Teacher("scott",30,2000);
        person[3] = new Teacher("king",50,400000);
        person[4] = new Person("jack",20);

        for (int i = 0; i < person.length; i++) {
            //动态绑定机制
            System.out.println(person[i].say());

            if(person[i] instanceof Student){
                Student student = (Student) person[i];
                student.study();
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            }else {
                System.out.println("你的类型有误，请自行检查！！！");
            }
            System.out.println("**********************************************");
        }
    }
}
