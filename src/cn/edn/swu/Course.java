package cn.edn.swu;

public class Course {
    private String courseId;
    private String courseName;
    private String teacher;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        System.out.println(this.courseName+" changed course id");
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        System.out.println("This course changed name");
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        System.out.println(this.courseName+" changed course teacher");
        this.teacher = teacher;
    }

    public Course(){} //无参构造函数

    public Course(String courseId,String courseName,String teacher){
        this.courseId=courseId;
        this.courseName=courseName;
        this.teacher=teacher;
    }  //带有参数的构造函数

    public void showInfo(){
        System.out.println("The course's name is "+courseName);
        System.out.println("The course's id is "+courseId);
        System.out.println("The course's teacher is "+teacher);
    }
}
