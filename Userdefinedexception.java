import java.util.*;

class PayOutOfBoundsException extends Exception{
    PayOutOfBoundsException(String msg){
        System.out.println("Pay out of bounds exception :"+msg);
    }
}


public class Userdefinedexception{
    public static void main(String[] args)  throws PayOutOfBoundsException{
        System.out.println("enter the employee salary:");
        Scanner sc =new Scanner(System.in);
        int pay = sc.nextInt();
        if(pay<10000 || pay>50000){
            throw new PayOutOfBoundsException("Salary not in the valid range");
        }else 
             System.out.println("employee eligible for 30% hike");
    }
}