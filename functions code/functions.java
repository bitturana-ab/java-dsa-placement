import java.util.*;
class functions{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();//next();for one word,line for paragraph.
        printMyName(name);
    }
}