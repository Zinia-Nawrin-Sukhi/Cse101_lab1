import java.util.Scanner;
public class P22
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int row=sc.nextInt();
    System.out.println("please enter a number");
    int col=sc.nextInt();
    for(int rown=1; rown<=row;rown++)
   
    {
      for(int coln=1;coln<=col;coln++){

        if(rown==row||coln==1||coln==rown)
      System.out.print("*");
     
       else
      System.out.print(" ");
      
      }
        System.out.println();
      }
    }
  }
