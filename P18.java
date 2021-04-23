import java.util.Scanner;
public class P18
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
      for(int starcount=1;starcount<=rowNum;starcount++){
      System.out.print("*");
      
      }
        System.out.println();
      }
    }
  }
