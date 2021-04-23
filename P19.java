import java.util.Scanner;
public class P19
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int row=sc.nextInt();
   
    for(int rowNum=1; rowNum<=row;rowNum++)
   
    {
      int space=row-rowNum;
      for(int spacecount=1;spacecount<=space;spacecount++){

        
      System.out.print(" ");
      }
      for(int starcount=1;starcount<=(2*rowNum)-1;starcount++){
      System.out.print("*");
      
      }
        System.out.println();
      }
    }
  }
