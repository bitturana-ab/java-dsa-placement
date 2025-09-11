
class Student {

    // name will be diff for all object
    String name;
    // same for all students and memory will be only one school name
    static String schoolName;

    public static void changeSchool(String sn) {
        schoolName = sn;
    }
}

public class StaticKey {

    public static void main(String[] args) {
        // static can access through class
        Student.schoolName = "anna university";
        Student.changeSchool("ab college");
        Student s = new Student();
        s.name = "ab";
        System.out.println("Name: " + s.name + "\n" + "School: " + Student.schoolName);
    }
}
