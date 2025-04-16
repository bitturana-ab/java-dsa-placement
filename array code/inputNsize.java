import java.util.*;
class inputNsize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[] = new int[size];
        
        //size=numbers.length//properties hai
        //input data
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        //output
        for(int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }
    }
}