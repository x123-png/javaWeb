package cn.edn.swu;

public class main {
    public static void main(String[] args) {
        Student s1=new Student(1,"Oliver","male",18);
        Student s2=new Student(2,"Isla","female",19);
        Course c1=new Course("001","Math","Jack");
        Course c2=new Course("002","English","David");
        s1.showInfo();
        s2.showInfo();
        c1.showInfo();
        c2.showInfo();
        s1.setAge(19);
        s2.setId(3);
        c1.setCourseId("4");
        c2.setTeacher("Tim");
        s1.showInfo();
        s2.showInfo();
        c1.showInfo();
        c2.showInfo();
    }
}
