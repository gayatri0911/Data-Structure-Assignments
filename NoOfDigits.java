import java.util.*;
import java.io.*;
class NoOfDigits
{
  public static void main(String[] args)throws IOException
   {
    int count=0;
    System.out.println("Enter Number:");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()) ;
    System.out.println("Entered number is:"+num);
    while(num>0)
    {
      int temp = num%10;
      count++;
      num=num/10;
    }
     System.out.println("number contains "+count+" digits");
   }
}