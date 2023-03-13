package bt2;

public class Student {
     String name= "John";
     String classes = "C02";
    public Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("tên "+name+" lớp "+classes);
    }
}
