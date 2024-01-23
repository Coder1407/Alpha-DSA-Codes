public class VII_CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amitesh";
        s1.roll = 123;
        s1.password = "abcd";
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}
class Student {
    String name;
    int roll;
    String password;
    Student() {
        System.out.println("Constructor is called");
    }
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
