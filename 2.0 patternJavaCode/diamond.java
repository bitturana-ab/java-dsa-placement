class diamond{
    public static void main(String[] args){
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces print
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars print
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces print
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars print
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}