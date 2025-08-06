class compareStrings{
    public static void main(String args[]){
        String name1 = "bittu";
        String name2 = "bittu";
        //compare
        //1 s1 > s2 : +ve
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve
        //bittu < vittu
        //bittu < kittu //b<k<v
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }
    }
}