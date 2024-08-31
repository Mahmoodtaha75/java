import java.util.Calendar;

public class Datedemo{
  public static void main(String[] args){
   Calendar cal = Calendar.getInstance();
   String[] month={"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
   System.out.println("Current month is:"+month[cal.get(Calendar.MONTH)]);
}
}