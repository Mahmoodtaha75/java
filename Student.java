import java.util.*;

class firstyear{
    String classname;
    String classteacher;
    int stdcount;
    int stdmarks[] = new int[50];
    String stdnames[] = new String[50];
    Scanner sc = new Scanner(System.in);

    public firstyear(){
        getinfo();
    }

    public void getinfo(){
        System.out.println("please Enter the class name:");
        classname = sc.nextLine();
        System.out.println("please enter the class teacher name:");
        classteacher = sc.nextLine();
        System.out.println("please enter the total number of Students of the class:");
        stdcount = Integer.parseInt(sc.nextLine());

        System.out.println("please enter the names of all the students of the class:");
        for(int i=0;i<stdcount;i++)
          stdnames[i] = sc.nextLine();

        System.out.println("please enter the marks of all the students:");
        for(int i =0;i<stdcount;i++){
            stdmarks[i]=sc.nextInt();
        }  

    }
    public void bestStudent(){
        int best =0,k=1;
        for(int i =0;i<stdcount;i++){
            if(stdmarks[i]>best){
                best = stdmarks[i];
                k =i;
            }
        }
        System.out.println("the best Student is "+stdnames[k]);
    }
}
public class Student {
    public static void main(String [] args){
        firstyear fy = new firstyear();
        fy.bestStudent();
    }
}
