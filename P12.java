import java.util.Scanner;
public class P12{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int lineAmount = sc.nextInt();
    
    for(int i = 1; i<=lineAmount; i++){
      for(int j = 1; j<=(lineAmount-i);j++){
        System.out.print(" ");
      }
      for(int k=(lineAmount-i+1);k<=lineAmount;k++){
        System.out.print(k);
      }
      System.out.println();  
    }
    
  }
}
