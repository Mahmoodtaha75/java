public class Divisionbyzero{
public static void main(String[] args){
int a = 10 ;
int b = 1;
try{
  System.out.println(a/b);
}catch(ArithmeticException e){
  System.out.println("division by zero is not possible");
}
}
}