import java.util.*;
import java.io.*;
class DigitOccurence
{
  static int count_0=0,count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count_6=0,count_7=0,count_8=0,count_9=0;

  public static void main(String[] args)throws IOException
   {
    System.out.println("Enter Number:");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()) ;
    System.out.println("Entered number is:"+num);
    while(num>0)
    {
      int temp = num%10;
      occurence(temp);
      num=num/10;
    }
    if(count_0>0)
      System.out.println("0 occured "+count_0+" times");
    if(count_1>0)
      System.out.println("1 occured "+count_1+" times");
    if(count_2>0)
      System.out.println("2 occured "+count_2+" times");
    if(count_3>0)
      System.out.println("3 occured "+count_3+" times");
    if(count_4>0)
      System.out.println("4 occured "+count_4+" times");
    if(count_5>0)
      System.out.println("5 occured "+count_5+" times");
    if(count_6>0)
      System.out.println("6 occured "+count_6+" times");
    if(count_7>0)
      System.out.println("7 occured "+count_7+" times");
    if(count_8>0)
      System.out.println("8 occured "+count_8+" times");
    if(count_9>0)
      System.out.println("9 occured "+count_9+" times");
  }
  static void occurence(int temp)
  {
    switch(temp)
      {
        case 0:count_0++;
        break;
        case 1:count_1++;
        break;
        case 2:count_2++;
        break;
        case 3:count_3++;
        break;
        case 4:count_4++;
        break;
        case 5:count_5++;
        break;
        case 6:count_6++;
        break;
        case 7:count_7++;
        break;
        case 8:count_8++;
        break;
        case 9:count_9++;
        break;
      }
  }
}