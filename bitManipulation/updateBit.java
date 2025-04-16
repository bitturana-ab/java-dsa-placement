import java.util.*;
class updateBit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 : setbit to 1;
        //oper = 0 : clear bit to 0;
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1){
            //setbit 1
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clearbit to 0
            int notbitMask = ~(bitMask);
            int newNumber = notbitMask & n;
            System.out.println(newNumber);
        }
    }
}