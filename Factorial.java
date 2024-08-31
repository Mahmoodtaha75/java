public class Factorial{
    public static void main(String[] args) {
        int fact = 1, i = 1,n;
        while (i<=10) {
            fact = fact*i;
            System.out.println("the factorial of "+i+" is: "+fact);
            i++;
        }
    }
}