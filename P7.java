import java.util.Scanner;
public class P7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        for(int j=1; j<=y; j++){
            System.out.print(j);
        }
        System.out.println();
        
        for(int i=1; i<=x-2;i++){
            
            for(int j=1; j<=y; j++){
                if(j>1&&j<y){
                System.out.print(" ");
                }else{
                System.out.print(j);
            }
            }
            System.out.println();
        }
        for(int j=1; j<=y; j++){
            System.out.print(j);
        }
        
    }
}
