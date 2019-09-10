class Calc {
 int num1;
 int num2;
 int num3;
 int result;
 
  public void perform()
{
   result = num1 * num2 * num3;
 }
}


public class Driz{
 public static void main(String[]args){

   Calc obj = new Calc();
   obj.num1 = 10;
   obj.num2 = 10;
   obj.num3 = 10;

  obj.perform();
  System.out.println(obj.result);

 }
}