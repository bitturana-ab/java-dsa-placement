class marks{
    public static void main(String args[]){
        //int [] marks=new int[3];
        int marks[]=new int[10];  //same same hai
        marks[0]=97;  //phy
        marks[1]=98;  //chem
        marks[2]=95;  //eng
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}