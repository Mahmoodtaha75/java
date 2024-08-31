import java.util.*;


class Student{
    Scanner sc = new Scanner(System.in);
    String enrollment_id;
    int sub1,sub2,sub3,total;
    String name;

      Student(){
        readStudentInfo();
      }

      public void readStudentInfo(){
        System.out.println("Enter student details");
        System.out.println("Enrollment number:");
        enrollment_id = sc.next();
        System.out.println("Name:");
        name = sc.next();
        System.out.println("enter marks of 3 students");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();

        if(sub1>=50 && sub2>=50 && sub3>=50)
             total = sub1+sub2+sub3;
             else
             total = 0;
      }
      public void displayinfo(){
        System.out.println(enrollment_id+"\t\t"+name+"\t"+total);
      }
}
public class StudentInfo{
    public static void main(String[] args) {
        Student s[] = new Student[3];
        for(int i =0;i<3;i++){
            s[i] = new Student();
        }
        System.out.println("\t\tStudent details");
        System.out.println("Enrollmentno\tName\ttotal");
        for(int i =0;i<3;i++){
            s[i].displayinfo();
        }
    }
} 