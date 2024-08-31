class Student{
    static String collegename = "Pes college";
    int rollno;
    String name;

    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println(collegename+" "+rollno+""+name);
    }
}
public class StaticDemo {
    public static void main(String[] args){
        System.out.println("objects sharing the static vriable - college naem \n");
        Student s1= new Student(1001,"d87");
        Student s2 = new Student(1002,"Collegedev");
        s1.display();
        s2.display();
        System.out.println("Static value changed by one of the object \n");
        s1.collegename = "Jain college";
        s1.display();
        s2.display();
    }
}
