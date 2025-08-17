class butterfly{
    public static void main(String[] args){
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                //star print
                System.out.print("* ");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                //space print
                System.out.print("  ");
            }
            //right star print
            for(int j=1;j<=i;j++){
                //print star
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space print
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            //right star print
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}