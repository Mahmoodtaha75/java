public class methodoverloadingdemo{
   int addtion(){
     return(10+10);
}
   int addtion(int x,int y){
     return(x+y);
 }
   float addtion(float a, float b){
      return(a+b);
 }
  
  public static void main(String [] args){
     methodoverloadingdemo a = new methodoverloadingdemo();
     System.out.println("By using default values sum of 10 and 10 is:"+a.addtion());
     System.out.println("by using two integer values(10 and 20) value is:"+a.addtion(10,20));
     System.out.println("by using float values(10.5 and 20.5) value is:"+a.addtion(10.5f,20.5f));
 }
}