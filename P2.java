import java.util.Scanner;
public class P2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int row=sc.nextInt();
    System.out.println("please enter a number");
    int col=sc.nextInt();
    int rown=1; 
    while(rown<=row)
    {
      int coln=1;
      while(coln<=col)
      {
      System.out.print(coln);
      coln++;
    }
      System.out.println();
      rown++;
    }
                         
  }
}