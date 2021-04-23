import java.util.Scanner;
public class P3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int row=sc.nextInt();
   
    for(int rownum =1;rownum<= row;rownum++)
    {
      for(int i=1;i<=rownum;i++)
    {
      System.out.print(i);
    }
    System.out.println();
    }
    
  }
}