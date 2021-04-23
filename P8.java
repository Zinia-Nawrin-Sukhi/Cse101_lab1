import java.util.Scanner;
public class P8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        System.out.println("1");
        for(int i=2; i<=h-1; i++){
            for(int j=1; j<=i; j++){
                if(j>1&&j<i){
                System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        for(int j=1; j<=h; j++){
            System.out.print(j);
        }
        
    }
}