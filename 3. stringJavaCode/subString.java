class subString{
    public static void main(String args[]){
        String sentence = "na sanjay dhan da";
        //substring la (beg index,ending index-1);
        String name = sentence.substring(3,8);
        String begcut = sentence.substring(3);//no need the last index
        System.out.println(name);
        System.out.println(begcut);
    }
}