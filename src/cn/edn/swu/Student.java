package cn.edn.swu;

public class Student {
    private int id; //学号
    private String name; //姓名
    private String gender; //性别
    private int age; //年龄

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println(this.name+" changed id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(this.name+" changed name");
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        System.out.println(this.name+" changed gender");
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(this.name+" changed age");
        this.age = age;
    }

    public Student(){}  //无参构造函数
    public Student(int id,String name,String gender,int age){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }  //带参数的初始化构造函数

    public void showInfo(){  //用于显示该学生的信息
        System.out.println("The student's id is "+id);
        System.out.println("The student's name is "+name);
        System.out.println("The student's gender is "+gender);
        System.out.println("The student's age is "+age);
    }
}
