import java.util.*;
class table{
    public static void main(String args[]){
        System.out.print("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}