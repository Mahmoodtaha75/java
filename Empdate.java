import java.util.Date;

class Employee{
    String name;
    Date appdate;

    public Employee(String nm, Date apdt){
        name = nm;
        appdate =apdt;
    }

    public void display(){
        System.out.println("employee name:"+name+"\t appointment date: \t"+appdate.getDate()+"/"+appdate.getMonth()+"/"+appdate.getYear());
    }
}

public class Empdate{
    public static void main(String as[]){
        Employee emp[] = new Employee[6];
        emp[0] = new Employee("Neeraja k",new Date(2000,05,22));
        emp[1] = new Employee("Kuldeep m",new Date(2004,01,12));
        emp[2] = new Employee("ROja D",new Date(2003,04,2));
        emp[3] = new Employee("Jyothi", new Date(2002,01,01));
        emp[4] = new Employee("Asha", new Date(2001,04,22));
        emp[5] = new Employee("Ammu", new Date(1999,01,25));
        System.out.println("list of Employees");
        for(int i =0;i<emp.length;i++)
         emp[i].display();

        for(int i =0;i<emp.length;i++){
            for(int j = i;j<emp.length;j++){
                if(emp[i].appdate.after(emp[j].appdate)){
                    Employee t = emp[i];
                    emp[i] = emp[j];
                    emp[j] = t;
                }
            }
        }

        System.out.println("\n List of the employee Seniority wise");
        for(int i=0;i<emp.length;i++)
        emp[i].display();
    }
}