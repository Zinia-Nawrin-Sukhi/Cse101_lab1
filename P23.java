import java.util.Scanner;
public class P23{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int lineAmount = sc.nextInt();
    
    for(int k=1;k<=lineAmount-1;k++){
        System.out.print(" ");
      }
    System.out.println("*");
    
    
    for(int i = 2; i<=lineAmount-1; i++){
      for(int j = 1; j<=(lineAmount-i);j++){
        System.out.print(" ");
      }
      for(int k=(lineAmount-i+1);k<=lineAmount;k++){
          if(k>(lineAmount-i+1)&&k<lineAmount){
        System.out.print(" ");
          }else{
              System.out.print("*");
          }
      }
      System.out.println();  
    }
    for(int k=1;k<=lineAmount;k++){
        System.out.print("*");
      }
    
  }
}
