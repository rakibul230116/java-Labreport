package Labreport.L13;

class Student1 {
    int idNo;
    String name;

    void setName(String myName) {
        name = myName;
    }

    void setId(int id) {
        idNo = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNo);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        Student1 obj2 = new Student1();

        obj1.setName("Rakibul");
        obj1.setId(230116);
        obj1.display();

        obj2.setName("Hassan");
        obj2.setId(230117);
        obj2.display();
    }
}

