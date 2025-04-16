for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                //star print
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
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