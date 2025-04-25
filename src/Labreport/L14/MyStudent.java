package Labreport.L14;

class Student {
    int id;
    String name;

    public Student(int i, String n) {
        id = i;
        name = n;
    }

    public void setId(int myId) {
        id = myId;
    }

    public void setName(String myName) {
        name = myName;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class MyStudent {
    public static void main(String[] args) {
        Student obj1 = new Student(230116, "Rakibul");
        Student obj2 = new Student(230117, "Hassan");

        obj1.display();

        obj1.setId(230118);
        obj1.setName("Ali");

        obj1.display();

        obj2.display();
    }
}

