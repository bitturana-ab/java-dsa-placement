class palindromicNumber{
    public static void main(String[] args){
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces print
            for(int j=1;j<=n-i;j++){
                //inner palinromic num print n to 1
                System.out.print(" ");
            }    
            for(int j=i;j>=1;j--){
                    System.out.print(j);
            }
            //right num print
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}